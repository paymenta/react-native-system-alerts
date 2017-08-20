
package com.reactnativesystemalerts;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.app.AlertDialog;

public class RNReactNativeSystemAlertsModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNReactNativeSystemAlertsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNReactNativeSystemAlerts";
  }

  @ReactMethod
  public void alert(
    final String message,
    final String buttonText,
    final String title) {
      new AlertDialog.Builder(getCurrentActivity())
          .setMessage(message)
          .setPositiveButton(buttonText, null)
          .show();
  }
}
