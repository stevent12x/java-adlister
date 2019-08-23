import java.util.List;
import java.util.ArrayList;

public class ListAdsDao implements Ads {
    private List<Ad> ads;

    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

@Override
public Ad findOne(long id) {
    return ads.get((int)id);
}

@Override
public void insert(Ad ad) {
    ads.add(ad);
}

@Override
public void update(Ad ad) {
    ads.remove(ad.getId());
    ads.add(ad);
}

@Override
public void destroy(Ad ad) {
    ads.remove(ad);
}

    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad(
                1,
                1,
                "playstation for sale",
                "This is a slightly used playstation"
        ));
        ads.add(new Ad(
                2,
                1,
                "Super Nintendo",
                "Get your game on with this old-school classic!"
        ));
        ads.add(new Ad(
                3,
                2,
                "Junior Java Developer Position",
                "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript"
        ));
        ads.add(new Ad(
                4,
                2,
                "JavaScript Developer needed",
                "Must have strong Java skills"
        ));
        return ads;
    }
}