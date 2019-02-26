package F_26_02_2016;


public abstract class WebContent implements ContentRestriction{

    String description;
    Image image;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public abstract Integer amountOfNews();
    public abstract ContentRestriction restrictContent(String keyword);
}
