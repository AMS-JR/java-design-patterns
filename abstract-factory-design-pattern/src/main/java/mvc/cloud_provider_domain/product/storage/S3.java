package mvc.cloud_provider_domain.product.storage;

public class S3 implements StorageService{
    @Override
    public void store() {
        System.out.println("Store on S3!");
    }
}
