import java.util.List;

public interface Ads {
    List<Ad> all();
    Ad findOne(long id);
    void insert (Ad ad);
    void update (Ad ad);
    void destroy (Ad ad);
}
