package mvc.cloud_provider_domain;

import mvc.cloud_provider_domain.factory.AWSFactory;
import mvc.cloud_provider_domain.factory.AzureFactory;
import mvc.cloud_provider_domain.factory.CloudFactory;
import mvc.cloud_provider_domain.factory.GCPFactory;

public class Demo {
    public static CloudFactoryProducer configure(String cloud){
        return switch (cloud){
            case "AWS" -> new CloudFactoryProducer(new AWSFactory());
            case "Azure" -> new CloudFactoryProducer(new AzureFactory());
            case "GCP" -> new CloudFactoryProducer(new GCPFactory());
            default -> throw new IllegalArgumentException("No such cloud exists: " + cloud);
        };
    }
    public static void main(String[] args) {
        CloudFactoryProducer cfp = configure("AWS");
        cfp.bootstrap();
    }
}
