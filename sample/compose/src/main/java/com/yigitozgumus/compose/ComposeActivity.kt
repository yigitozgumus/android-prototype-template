package com.yigitozgumus.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.yigitozgumus.compose.ui.theme.PrototypeTheme
import com.yigitozgumus.experiment.testComponent

class ComposeActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
	super.onCreate(savedInstanceState)
	setContent {
	  PrototypeTheme {
		testComponent()
	  }
	}
  }
}
