package xran.json;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CountryResponse;
import com.maxmind.geoip2.record.Continent;

public class GeoIPTest {

	public static void main(String[] args)
	{
		File database = new File("GeoLite2-City.mmdb");

		DatabaseReader reader;
		try {
			reader = new DatabaseReader.Builder(database).build();
			InetAddress ipAddress = InetAddress.getByName("31.216.54.9");

			CountryResponse r = reader.country(ipAddress);;
			 
			Continent continent = r.getContinent();
			System.out.println(continent.getCode());
		} catch (GeoIp2Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
