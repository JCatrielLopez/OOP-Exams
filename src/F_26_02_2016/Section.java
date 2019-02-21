package F_26_02_2016;

import java.util.ArrayList;

public class Section extends WebContent {

    ArrayList<WebContent> content;

    public Section(ArrayList<WebContent> content) {
        this.content = content;
    }

    @Override
    public Integer amountOfNews() {
        Integer out = 0;
        for (WebContent content: content)
            out += content.amountOfNews();

        return out;
    }

    @Override
    public ContentRestriction restrictContent(String keyword) {
        ArrayList<WebContent> content = new ArrayList<>();

        for(WebContent c: this.content)
            content.add((WebContent) c.restrictContent(keyword));

        if (content.size() != 0) {
            Section result = new Section(content);
            return result;
        }
        else
            return null;
    }

}
