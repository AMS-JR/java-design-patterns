package mvc.cloud_provider_domain.product.compute;

public class VirtualMachine implements ComputeService{
    @Override
    public void deploy() {
        System.out.println("Deploy on Azure VirtualMachine!");
    }
}
