import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterRepositoryTest {
    OpenPoster poster1 = new OpenPoster("маам", "мава", "пвпив");
    OpenPoster poster2 = new OpenPoster("Null", "комедия", "Отель белград");
    OpenPoster poster3 = new OpenPoster("ужасы", "пародии", "смешарики");
    OpenPoster poster4 = new OpenPoster("ужасы", "пародии", "смешарики");
    OpenPoster poster5 = new OpenPoster("ужасы", "пародии", "смешарики");

    @Test
    public void testAddNew() {

        PosterRepository poster = new PosterRepository();
        poster.add(poster1);
        poster.add(poster2);
        poster.add(poster3);

        OpenPoster[] expected = {poster1, poster2, poster3};
        OpenPoster[] actual = poster.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testСonclusionLast() {
        PosterRepository poster = new PosterRepository(5);
        poster.add(poster1);
        poster.add(poster2);
        poster.add(poster3);
        poster.add(poster4);
        poster.add(poster5);

        OpenPoster[] expected = {poster5, poster4, poster3, poster2, poster1};
        OpenPoster[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
