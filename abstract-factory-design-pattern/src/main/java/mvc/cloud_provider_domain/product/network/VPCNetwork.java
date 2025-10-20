package mvc.cloud_provider_domain.product.network;

public class VPCNetwork implements NetworkService{
    @Override
    public void configure() {
        System.out.println("configure GCP VPCNetwork!");
    }
}
