package amimo.dcc;

/* JADX INFO: loaded from: classes3.dex */
public class DccApplication extends android.app.Application {
    static {
            java.lang.String r0 = "hax"
            java.lang.System.loadLibrary(r0)
            return
    }

    public native DccApplication();

    public static final native void initDcc();
}
