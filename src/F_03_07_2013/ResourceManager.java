package F_03_07_2013;

public interface ResourceManager {

    void addResource(Resource r) throws Exception;
    void removeResource(Resource r) throws Exception;
    float getCosto();
    Integer getSize();

}
