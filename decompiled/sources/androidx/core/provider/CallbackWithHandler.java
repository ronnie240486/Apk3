package androidx.core.provider;

/* JADX INFO: loaded from: classes2.dex */
class CallbackWithHandler {

    @androidx.annotation.NonNull
    private final androidx.core.provider.FontsContractCompat.FontRequestCallback mCallback;

    @androidx.annotation.NonNull
    private final android.os.Handler mCallbackHandler;



    public CallbackWithHandler(@androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.FontRequestCallback r1) {
            r0 = this;
            r0.<init>()
            r0.mCallback = r1
            android.os.Handler r1 = androidx.core.provider.CalleeHandler.create()
            r0.mCallbackHandler = r1
            return
    }

    public CallbackWithHandler(@androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.FontRequestCallback r1, @androidx.annotation.NonNull android.os.Handler r2) {
            r0 = this;
            r0.<init>()
            r0.mCallback = r1
            r0.mCallbackHandler = r2
            return
    }

    private void onTypefaceRequestFailed(int r4) {
            r3 = this;
            androidx.core.provider.FontsContractCompat$FontRequestCallback r0 = r3.mCallback
            android.os.Handler r1 = r3.mCallbackHandler
            androidx.core.provider.CallbackWithHandler$2 r2 = new androidx.core.provider.CallbackWithHandler$2
            r2.<init>(r0, r4)
            r1.post(r2)
            return
    }

    private void onTypefaceRetrieved(@androidx.annotation.NonNull android.graphics.Typeface r4) {
            r3 = this;
            androidx.core.provider.FontsContractCompat$FontRequestCallback r0 = r3.mCallback
            android.os.Handler r1 = r3.mCallbackHandler
            androidx.core.provider.CallbackWithHandler$1 r2 = new androidx.core.provider.CallbackWithHandler$1
            r2.<init>(r0, r4)
            r1.post(r2)
            return
    }

    public final void onTypefaceResult(@androidx.annotation.NonNull androidx.core.provider.FontRequestWorker.TypefaceResult r3) {
            r2 = this;
            int r0 = r3.mResult
            if (r0 != 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto Lf
            android.graphics.Typeface r3 = r3.mTypeface
            r2.onTypefaceRetrieved(r3)
            goto L12
        Lf:
            r2.onTypefaceRequestFailed(r0)
        L12:
            return
    }
}
