package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.ArticlePageObject;

public class iOSArticlePageObject extends ArticlePageObject
{
    static {
        TITLE = "id:Java (programming language)";
        FOOTER_ELEMENT = "id:View article in browser";
        OPTIONS_ADD_TO_MY_LIST_BUTTON = "id:Save for later";
        CLOSE_ARTICLE_BUTTON = "id:Back";
        CLOSE_SYNC_WINDOW_BUTTON = "id:places auth close";
        IMAGE_OF_ARTICLE = "xpath://XCUIElementTypeImage";
        CLOSE_IMAGE_BUTTON = "id:close";
        NAME_OF_IMAGE = "id:Android robot head (2019-)";
    }

    public iOSArticlePageObject(AppiumDriver driver)
    {
        super(driver);
    }
}
