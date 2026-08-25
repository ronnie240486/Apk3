package androidx.core.view.inputmethod;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"PrivateConstructorForUtilityClass"})
public final class InputConnectionCompat {
    private static final java.lang.String COMMIT_CONTENT_ACTION = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final java.lang.String COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final java.lang.String COMMIT_CONTENT_CONTENT_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final java.lang.String COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final java.lang.String COMMIT_CONTENT_DESCRIPTION_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final java.lang.String COMMIT_CONTENT_FLAGS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final java.lang.String COMMIT_CONTENT_FLAGS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final java.lang.String COMMIT_CONTENT_INTEROP_ACTION = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final java.lang.String COMMIT_CONTENT_LINK_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final java.lang.String COMMIT_CONTENT_LINK_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final java.lang.String COMMIT_CONTENT_OPTS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final java.lang.String COMMIT_CONTENT_OPTS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final java.lang.String COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final java.lang.String COMMIT_CONTENT_RESULT_RECEIVER_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final java.lang.String EXTRA_INPUT_CONTENT_INFO = "androidx.core.view.extra.INPUT_CONTENT_INFO";
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;
    private static final java.lang.String LOG_TAG = "InputConnectionCompat";



    @androidx.annotation.RequiresApi(25)
    public static class Api25Impl {
        private Api25Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean commitContent(android.view.inputmethod.InputConnection r0, android.view.inputmethod.InputContentInfo r1, int r2, android.os.Bundle r3) {
                boolean r0 = r0.commitContent(r1, r2, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface OnCommitContentListener {
        boolean onCommitContent(@androidx.annotation.NonNull androidx.core.view.inputmethod.InputContentInfoCompat r1, int r2, @androidx.annotation.Nullable android.os.Bundle r3);
    }

    public static /* synthetic */ boolean $r8$lambda$KpUNHX7G_3SrNfrFIzMfcFEp1Cw(android.view.View r0, androidx.core.view.inputmethod.InputContentInfoCompat r1, int r2, android.os.Bundle r3) {
            boolean r0 = lambda$createOnCommitContentListenerUsingPerformReceiveContent$0(r0, r1, r2, r3)
            return r0
    }

    @java.lang.Deprecated
    public InputConnectionCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean commitContent(@androidx.annotation.NonNull android.view.inputmethod.InputConnection r7, @androidx.annotation.NonNull android.view.inputmethod.EditorInfo r8, @androidx.annotation.NonNull androidx.core.view.inputmethod.InputContentInfoCompat r9, int r10, @androidx.annotation.Nullable android.os.Bundle r11) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L11
            java.lang.Object r8 = r9.unwrap()
            android.view.inputmethod.InputContentInfo r8 = (android.view.inputmethod.InputContentInfo) r8
            boolean r7 = androidx.core.view.inputmethod.InputConnectionCompat.Api25Impl.commitContent(r7, r8, r10, r11)
            return r7
        L11:
            r2 = 2
            r3 = 4
            r4 = 3
            r5 = 1
            r6 = 0
            if (r0 < r1) goto L1a
            r8 = 1
            goto L3b
        L1a:
            android.os.Bundle r0 = r8.extras
            if (r0 != 0) goto L20
        L1e:
            r8 = 0
            goto L3b
        L20:
            java.lang.String r1 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            boolean r0 = r0.containsKey(r1)
            android.os.Bundle r8 = r8.extras
            java.lang.String r1 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            boolean r8 = r8.containsKey(r1)
            if (r0 == 0) goto L34
            if (r8 == 0) goto L34
            r8 = 4
            goto L3b
        L34:
            if (r0 == 0) goto L38
            r8 = 3
            goto L3b
        L38:
            if (r8 == 0) goto L1e
            r8 = 2
        L3b:
            if (r8 == r2) goto L43
            if (r8 == r4) goto L42
            if (r8 == r3) goto L42
            return r6
        L42:
            r5 = 0
        L43:
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            if (r5 == 0) goto L4d
            java.lang.String r0 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L4f
        L4d:
            java.lang.String r0 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L4f:
            android.net.Uri r1 = r9.getContentUri()
            r8.putParcelable(r0, r1)
            if (r5 == 0) goto L5b
            java.lang.String r0 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L5d
        L5b:
            java.lang.String r0 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L5d:
            android.content.ClipDescription r1 = r9.getDescription()
            r8.putParcelable(r0, r1)
            if (r5 == 0) goto L69
            java.lang.String r0 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L6b
        L69:
            java.lang.String r0 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L6b:
            android.net.Uri r9 = r9.getLinkUri()
            r8.putParcelable(r0, r9)
            if (r5 == 0) goto L77
            java.lang.String r9 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L79
        L77:
            java.lang.String r9 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L79:
            r8.putInt(r9, r10)
            if (r5 == 0) goto L81
            java.lang.String r9 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L83
        L81:
            java.lang.String r9 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L83:
            r8.putParcelable(r9, r11)
            if (r5 == 0) goto L8b
            java.lang.String r9 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            goto L8d
        L8b:
            java.lang.String r9 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
        L8d:
            boolean r7 = r7.performPrivateCommand(r9, r8)
            return r7
    }

    @androidx.annotation.NonNull
    private static androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener createOnCommitContentListenerUsingPerformReceiveContent(@androidx.annotation.NonNull android.view.View r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda2 r0 = new com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda2
            r1 = 2
            r0.<init>(r2, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.view.inputmethod.InputConnection createWrapper(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.NonNull android.view.inputmethod.InputConnection r1, @androidx.annotation.NonNull android.view.inputmethod.EditorInfo r2) {
            androidx.core.view.inputmethod.InputConnectionCompat$OnCommitContentListener r0 = createOnCommitContentListenerUsingPerformReceiveContent(r0)
            android.view.inputmethod.InputConnection r0 = createWrapper(r1, r2, r0)
            return r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static android.view.inputmethod.InputConnection createWrapper(@androidx.annotation.NonNull android.view.inputmethod.InputConnection r2, @androidx.annotation.NonNull android.view.inputmethod.EditorInfo r3, @androidx.annotation.NonNull androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener r4) {
            java.lang.String r0 = "inputConnection must be non-null"
            androidx.core.util.ObjectsCompat.requireNonNull(r2, r0)
            java.lang.String r0 = "editorInfo must be non-null"
            androidx.core.util.ObjectsCompat.requireNonNull(r3, r0)
            java.lang.String r0 = "onCommitContentListener must be non-null"
            androidx.core.util.ObjectsCompat.requireNonNull(r4, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L1b
            androidx.core.view.inputmethod.InputConnectionCompat$1 r3 = new androidx.core.view.inputmethod.InputConnectionCompat$1
            r3.<init>(r2, r4)
            return r3
        L1b:
            java.lang.String[] r3 = androidx.core.view.inputmethod.EditorInfoCompat.getContentMimeTypes(r3)
            int r3 = r3.length
            if (r3 != 0) goto L23
            return r2
        L23:
            androidx.core.view.inputmethod.InputConnectionCompat$2 r3 = new androidx.core.view.inputmethod.InputConnectionCompat$2
            r3.<init>(r2, r4)
            return r3
    }

    private static /* synthetic */ boolean lambda$createOnCommitContentListenerUsingPerformReceiveContent$0(android.view.View r5, androidx.core.view.inputmethod.InputContentInfoCompat r6, int r7, android.os.Bundle r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1
            r3 = 25
            if (r0 < r3) goto L31
            r7 = r7 & r2
            if (r7 == 0) goto L31
            r6.requestPermission()     // Catch: java.lang.Exception -> L28
            java.lang.Object r7 = r6.unwrap()
            android.view.inputmethod.InputContentInfo r7 = (android.view.inputmethod.InputContentInfo) r7
            if (r8 != 0) goto L1c
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            goto L22
        L1c:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r8)
            r8 = r0
        L22:
            java.lang.String r0 = "androidx.core.view.extra.INPUT_CONTENT_INFO"
            r8.putParcelable(r0, r7)
            goto L31
        L28:
            r5 = move-exception
            java.lang.String r6 = "InputConnectionCompat"
            java.lang.String r7 = "Can't insert content from IME; requestPermission() failed"
            android.util.Log.w(r6, r7, r5)
            return r1
        L31:
            android.content.ClipData r7 = new android.content.ClipData
            android.content.ClipDescription r0 = r6.getDescription()
            android.content.ClipData$Item r3 = new android.content.ClipData$Item
            android.net.Uri r4 = r6.getContentUri()
            r3.<init>(r4)
            r7.<init>(r0, r3)
            androidx.core.view.ContentInfoCompat$Builder r0 = new androidx.core.view.ContentInfoCompat$Builder
            r3 = 2
            r0.<init>(r7, r3)
            android.net.Uri r6 = r6.getLinkUri()
            androidx.core.view.ContentInfoCompat$Builder r6 = r0.setLinkUri(r6)
            androidx.core.view.ContentInfoCompat$Builder r6 = r6.setExtras(r8)
            androidx.core.view.ContentInfoCompat r6 = r6.build()
            androidx.core.view.ContentInfoCompat r5 = androidx.core.view.ViewCompat.performReceiveContent(r5, r6)
            if (r5 != 0) goto L60
            r1 = 1
        L60:
            return r1
    }
}
