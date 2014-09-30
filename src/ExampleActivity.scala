import android.app.Activity
import android.os.Bundle

class ExampleActivity extends Activity {

  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    // The activity is being created.
  }

  protected override def onStart() {
    super.onStart()
    // The activity is about to become visible.
  }

  protected override def onResume() {
    super.onResume()
    // The activity has become visible (it is now "resumed").
  }

  protected override def onPause() {
    super.onPause()
    // Another activity is taking focus (this activity is about to be "paused").
  }

  protected override def onStop() {
    super.onStop()
    // The activity is no longer visible (it is now "stopped")
  }

  protected override def onDestroy() {
    super.onDestroy()
    // The activity is about to be destroyed.
  }
}