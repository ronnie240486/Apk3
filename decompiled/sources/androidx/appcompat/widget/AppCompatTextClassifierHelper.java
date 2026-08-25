package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
final class AppCompatTextClassifierHelper {

    @androidx.annotation.Nullable
    private android.view.textclassifier.TextClassifier mTextClassifier;

    @androidx.annotation.NonNull
    private android.widget.TextView mTextView;

    @androidx.annotation.RequiresApi(26)
    public static final class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        @androidx.annotation.DoNotInline
        public static android.view.textclassifier.TextClassifier getTextClassifier(@androidx.annotation.NonNull android.widget.TextView r1) {
                android.content.Context r1 = r1.getContext()
                java.lang.Class<android.view.textclassifier.TextClassificationManager> r0 = android.view.textclassifier.TextClassificationManager.class
                java.lang.Object r1 = r1.getSystemService(r0)
                android.view.textclassifier.TextClassificationManager r1 = (android.view.textclassifier.TextClassificationManager) r1
                if (r1 == 0) goto L13
                android.view.textclassifier.TextClassifier r1 = r1.getTextClassifier()
                return r1
            L13:
                android.view.textclassifier.TextClassifier r1 = android.view.textclassifier.TextClassifier.NO_OP
                return r1
        }
    }

    public AppCompatTextClassifierHelper(@androidx.annotation.NonNull android.widget.TextView r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.mTextView = r1
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(api = 26)
    public android.view.textclassifier.TextClassifier getTextClassifier() {
            r1 = this;
            android.view.textclassifier.TextClassifier r0 = r1.mTextClassifier
            if (r0 != 0) goto La
            android.widget.TextView r0 = r1.mTextView
            android.view.textclassifier.TextClassifier r0 = androidx.appcompat.widget.AppCompatTextClassifierHelper.Api26Impl.getTextClassifier(r0)
        La:
            return r0
    }

    @androidx.annotation.RequiresApi(api = 26)
    public void setTextClassifier(@androidx.annotation.Nullable android.view.textclassifier.TextClassifier r1) {
            r0 = this;
            r0.mTextClassifier = r1
            return
    }
}
