package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class TextViewOnReceiveContentListener implements androidx.core.view.OnReceiveContentListener {
    private static final java.lang.String LOG_TAG = "ReceiveContent";

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(16)
    public static final class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static final class ApiImpl {
        private ApiImpl() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public TextViewOnReceiveContentListener() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.CharSequence coerceToText(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.NonNull android.content.ClipData.Item r1, int r2) {
            r2 = r2 & 1
            if (r2 == 0) goto L11
            java.lang.CharSequence r0 = r1.coerceToText(r0)
            boolean r1 = r0 instanceof android.text.Spanned
            if (r1 == 0) goto L15
            java.lang.String r0 = r0.toString()
            goto L15
        L11:
            java.lang.CharSequence r0 = r1.coerceToStyledText(r0)
        L15:
            return r0
    }

    private static void replaceSelection(@androidx.annotation.NonNull android.text.Editable r4, @androidx.annotation.NonNull java.lang.CharSequence r5) {
            int r0 = android.text.Selection.getSelectionStart(r4)
            int r1 = android.text.Selection.getSelectionEnd(r4)
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            int r0 = java.lang.Math.max(r0, r1)
            int r0 = java.lang.Math.max(r3, r0)
            android.text.Selection.setSelection(r4, r0)
            r4.replace(r2, r0, r5)
            return
    }

    @Override // androidx.core.view.OnReceiveContentListener
    @androidx.annotation.Nullable
    public androidx.core.view.ContentInfoCompat onReceiveContent(@androidx.annotation.NonNull android.view.View r8, @androidx.annotation.NonNull androidx.core.view.ContentInfoCompat r9) {
            r7 = this;
            java.lang.String r0 = "ReceiveContent"
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onReceive: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L1d:
            int r0 = r9.getSource()
            r1 = 2
            if (r0 != r1) goto L25
            return r9
        L25:
            android.content.ClipData r0 = r9.getClip()
            int r9 = r9.getFlags()
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.CharSequence r1 = r8.getText()
            android.text.Editable r1 = (android.text.Editable) r1
            android.content.Context r8 = r8.getContext()
            r2 = 0
            r3 = 0
        L3b:
            int r4 = r0.getItemCount()
            if (r2 >= r4) goto L65
            android.content.ClipData$Item r4 = r0.getItemAt(r2)
            java.lang.CharSequence r4 = coerceToText(r8, r4, r9)
            if (r4 == 0) goto L62
            if (r3 != 0) goto L52
            replaceSelection(r1, r4)
            r3 = 1
            goto L62
        L52:
            int r5 = android.text.Selection.getSelectionEnd(r1)
            java.lang.String r6 = "\n"
            r1.insert(r5, r6)
            int r5 = android.text.Selection.getSelectionEnd(r1)
            r1.insert(r5, r4)
        L62:
            int r2 = r2 + 1
            goto L3b
        L65:
            r8 = 0
            return r8
    }
}
