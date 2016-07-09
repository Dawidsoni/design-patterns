package design.patterns.proxy;

/**
 * Created by dawid on 09/07/16.
 */
class Image implements IDrawable {
    private String fileName;

    Image(String fileName) {
        this.fileName = fileName;
        loadImage();
    }

    public void loadImage() {
        System.out.println("Loading image from file");
    }

    @Override
    public int getWidth() {
        return 23;
    }

    @Override
    public int getHeight() {
        return 30;
    }
}
