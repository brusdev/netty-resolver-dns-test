package dev.brus;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        System.out.println("/etc/resolv.conf:");
        System.out.println(new String(Files.readAllBytes(Paths.get("/etc/resolv.conf")), StandardCharsets.US_ASCII));

        System.out.println("defaultAddressList:");
        System.out.println(DefaultDnsServerAddressStreamProvider.defaultAddressList());
    }
}

