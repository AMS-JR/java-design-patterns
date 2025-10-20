package mvc.cloud_provider_domain.product.compute;

public class ComputeEngine implements ComputeService{
    @Override
    public void deploy() {
        System.out.println("Deploy on ComputeEngine!");
    }
}
