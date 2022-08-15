public class PosterRepository {
    public OpenPoster[] open = new OpenPoster[0];
    public int limitResultLength;

    public PosterRepository() {
        limitResultLength = 10;
    }

    public PosterRepository(int limitResultLength) {
        this.limitResultLength = limitResultLength;
    }

    public void add(OpenPoster poster) {
        OpenPoster[] tmp = new OpenPoster[open.length + 1];
        for (int i = 0; i < open.length; i++) {
            tmp[i] = open[i];
        }
        tmp[tmp.length - 1] = poster;
        open = tmp;
    }

    public OpenPoster[] findAll() {
        return open;
    }

    public OpenPoster[] findLast() {
        int resultLength;
        if (limitResultLength < open.length) {

            resultLength = limitResultLength;
        } else {
            resultLength = open.length;
        }
        OpenPoster[] result = new OpenPoster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = open[open.length - 1 - i];
        }
        return result;
    }
}



