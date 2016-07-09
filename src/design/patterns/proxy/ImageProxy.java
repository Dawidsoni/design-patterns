package design.patterns.proxy;

/**
 * Created by dawid on 09/07/16.
 */
public class ImageProxy implements IDrawable {
    protected Image image;
    private String fileName;

    protected void loadIfNecessary() {
        if(image == null) {
            image = new Image(fileName);
        }
    }

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public int getWidth() {
        loadIfNecessary();
        return image.getWidth();
    }

    @Override
    public int getHeight() {
        loadIfNecessary();
        return image.getHeight();
    }

    public Image getImage() {
        loadIfNecessary();
        return image;
    }
}
