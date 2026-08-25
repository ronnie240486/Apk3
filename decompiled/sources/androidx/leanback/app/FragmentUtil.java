package androidx.leanback.app;

/* JADX INFO: loaded from: classes3.dex */
class FragmentUtil {
    private FragmentUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.Context getContext(android.app.Fragment r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            android.content.Context r2 = r2.getContext()
            return r2
        Lb:
            android.app.Activity r2 = r2.getActivity()
            return r2
    }
}
