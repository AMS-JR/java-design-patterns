package mvc.cloud_provider_domain.product.network;

public class VPC implements NetworkService{
    @Override
    public void configure() {
        System.out.println("configure AWS VPC network!");
    }
}
