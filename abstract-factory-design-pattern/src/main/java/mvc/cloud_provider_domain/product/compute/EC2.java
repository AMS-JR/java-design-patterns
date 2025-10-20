package mvc.cloud_provider_domain.product.compute;

public class EC2 implements ComputeService{
    @Override
    public void deploy() {
        System.out.println("Deploy on AWS EC2!");
    }
}
