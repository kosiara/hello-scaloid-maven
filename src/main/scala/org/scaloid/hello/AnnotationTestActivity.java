package org.scaloid.hello;

import android.app.Activity;
import com.googlecode.androidannotations.annotations.AfterInject;
import com.googlecode.androidannotations.annotations.EActivity;

/**
 * Created by kosiara on 12.02.14.
 */
@EActivity(R.layout.simple_textbox_layout)
//@EActivity(resName = "dashboard")
public class AnnotationTestActivity extends Activity {

    @AfterInject
    protected void afterInject() {

    }


}
