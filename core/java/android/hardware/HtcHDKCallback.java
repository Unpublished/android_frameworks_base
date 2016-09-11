package android.hardware;

import android.hardware.Camera.HtcCallback;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.util.Log;

public class HtcHDKCallback implements HtcCallback {
    private static String DTAG = "Camera2Mode-HDK";
    private HtcCallback mCallback = null;

    public HtcHDKCallback(HtcCallback htcCallback) {
        this.mCallback = htcCallback;
    }

    public void OnReceive(int i, int i2, int i3, Camera camera) {
        if (this.mCallback != null) {
            Log.i(DTAG, "callback OnReceive");
            this.mCallback.OnReceive(i, i2, i3, camera);
        }
    }

    public void onCaptureResult(CameraCharacteristics cameraCharacteristics, CaptureResult captureResult, Camera camera) {
        if (this.mCallback != null) {
            Log.i(DTAG, "onCaptureResult");
            this.mCallback.onCaptureResult(cameraCharacteristics, captureResult, camera);
        }
    }
}