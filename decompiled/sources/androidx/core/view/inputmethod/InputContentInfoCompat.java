package androidx.core.view.inputmethod;

/* JADX INFO: loaded from: classes2.dex */
public final class InputContentInfoCompat {
    private final androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl mImpl;

    @androidx.annotation.RequiresApi(25)
    public static final class InputContentInfoCompatApi25Impl implements androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl {

        @androidx.annotation.NonNull
        public final android.view.inputmethod.InputContentInfo mObject;

        public InputContentInfoCompatApi25Impl(@androidx.annotation.NonNull android.net.Uri r2, @androidx.annotation.NonNull android.content.ClipDescription r3, @androidx.annotation.Nullable android.net.Uri r4) {
                r1 = this;
                r1.<init>()
                android.view.inputmethod.InputContentInfo r0 = new android.view.inputmethod.InputContentInfo
                r0.<init>(r2, r3, r4)
                r1.mObject = r0
                return
        }

        public InputContentInfoCompatApi25Impl(@androidx.annotation.NonNull java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                android.view.inputmethod.InputContentInfo r1 = (android.view.inputmethod.InputContentInfo) r1
                r0.mObject = r1
                return
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        @androidx.annotation.NonNull
        public android.net.Uri getContentUri() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.mObject
                android.net.Uri r0 = r0.getContentUri()
                return r0
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        @androidx.annotation.NonNull
        public android.content.ClipDescription getDescription() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.mObject
                android.content.ClipDescription r0 = r0.getDescription()
                return r0
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        @androidx.annotation.NonNull
        public java.lang.Object getInputContentInfo() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.mObject
                return r0
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        @androidx.annotation.Nullable
        public android.net.Uri getLinkUri() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.mObject
                android.net.Uri r0 = r0.getLinkUri()
                return r0
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public void releasePermission() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.mObject
                r0.releasePermission()
                return
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public void requestPermission() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.mObject
                r0.requestPermission()
                return
        }
    }

    public static final class InputContentInfoCompatBaseImpl implements androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl {

        @androidx.annotation.NonNull
        private final android.net.Uri mContentUri;

        @androidx.annotation.NonNull
        private final android.content.ClipDescription mDescription;

        @androidx.annotation.Nullable
        private final android.net.Uri mLinkUri;

        public InputContentInfoCompatBaseImpl(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.NonNull android.content.ClipDescription r2, @androidx.annotation.Nullable android.net.Uri r3) {
                r0 = this;
                r0.<init>()
                r0.mContentUri = r1
                r0.mDescription = r2
                r0.mLinkUri = r3
                return
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        @androidx.annotation.NonNull
        public android.net.Uri getContentUri() {
                r1 = this;
                android.net.Uri r0 = r1.mContentUri
                return r0
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        @androidx.annotation.NonNull
        public android.content.ClipDescription getDescription() {
                r1 = this;
                android.content.ClipDescription r0 = r1.mDescription
                return r0
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        @androidx.annotation.Nullable
        public java.lang.Object getInputContentInfo() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        @androidx.annotation.Nullable
        public android.net.Uri getLinkUri() {
                r1 = this;
                android.net.Uri r0 = r1.mLinkUri
                return r0
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public void releasePermission() {
                r0 = this;
                return
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public void requestPermission() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface InputContentInfoCompatImpl {
        @androidx.annotation.NonNull
        android.net.Uri getContentUri();

        @androidx.annotation.NonNull
        android.content.ClipDescription getDescription();

        @androidx.annotation.Nullable
        java.lang.Object getInputContentInfo();

        @androidx.annotation.Nullable
        android.net.Uri getLinkUri();

        void releasePermission();

        void requestPermission();
    }

    public InputContentInfoCompat(@androidx.annotation.NonNull android.net.Uri r3, @androidx.annotation.NonNull android.content.ClipDescription r4, @androidx.annotation.Nullable android.net.Uri r5) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L11
            androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatApi25Impl r0 = new androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatApi25Impl
            r0.<init>(r3, r4, r5)
            r2.mImpl = r0
            goto L18
        L11:
            androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatBaseImpl r0 = new androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatBaseImpl
            r0.<init>(r3, r4, r5)
            r2.mImpl = r0
        L18:
            return
    }

    private InputContentInfoCompat(@androidx.annotation.NonNull androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    @androidx.annotation.Nullable
    public static androidx.core.view.inputmethod.InputContentInfoCompat wrap(@androidx.annotation.Nullable java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 25
            if (r1 >= r2) goto Lb
            return r0
        Lb:
            androidx.core.view.inputmethod.InputContentInfoCompat r0 = new androidx.core.view.inputmethod.InputContentInfoCompat
            androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatApi25Impl r1 = new androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatApi25Impl
            r1.<init>(r3)
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public android.net.Uri getContentUri() {
            r1 = this;
            androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl r0 = r1.mImpl
            android.net.Uri r0 = r0.getContentUri()
            return r0
    }

    @androidx.annotation.NonNull
    public android.content.ClipDescription getDescription() {
            r1 = this;
            androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl r0 = r1.mImpl
            android.content.ClipDescription r0 = r0.getDescription()
            return r0
    }

    @androidx.annotation.Nullable
    public android.net.Uri getLinkUri() {
            r1 = this;
            androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl r0 = r1.mImpl
            android.net.Uri r0 = r0.getLinkUri()
            return r0
    }

    public void releasePermission() {
            r1 = this;
            androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl r0 = r1.mImpl
            r0.releasePermission()
            return
    }

    public void requestPermission() {
            r1 = this;
            androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl r0 = r1.mImpl
            r0.requestPermission()
            return
    }

    @androidx.annotation.Nullable
    public java.lang.Object unwrap() {
            r1 = this;
            androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl r0 = r1.mImpl
            java.lang.Object r0 = r0.getInputContentInfo()
            return r0
    }
}
