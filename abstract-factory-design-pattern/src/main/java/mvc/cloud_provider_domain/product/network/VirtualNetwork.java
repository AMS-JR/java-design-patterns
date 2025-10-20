package mvc.cloud_provider_domain.product.network;

public class VirtualNetwork implements NetworkService{
    @Override
    public void configure() {
        System.out.println("configure Azure VirtualNetwork!");
    }
}
