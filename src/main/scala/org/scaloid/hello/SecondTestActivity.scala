package org.scaloid.hello

import org.scaloid.common._
import android.content.Context

class SecondTestActivity extends SActivity {

  onCreate {
    contentView = new SVerticalLayout {

      STextView("Second test activity")
      SButton(R.string.get_value_from_scala_button_text).onClick(
        getValueFromJavaClass
      )
    }
  }

  def getValueFromJavaClass(implicit context: Context): Unit = {
    val javaClass = new TestJavaClass
    toast(javaClass.getCount.toString)
  }

}
