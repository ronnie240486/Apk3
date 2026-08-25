package androidx.core.widget;

/* JADX INFO: compiled from: TextView.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0083\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022d\b\u0006\u0010\u0003\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00042d\b\u0006\u0010\u000e\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\r0\u00042%\b\u0006\u0010\u0010\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\r0\u0011H\u0086\bø\u0001\u0000\u001a7\u0010\u0013\u001a\u00020\u0001*\u00020\u00022%\b\u0004\u0010\u0014\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\r0\u0011H\u0086\bø\u0001\u0000\u001av\u0010\u0015\u001a\u00020\u0001*\u00020\u00022d\b\u0004\u0010\u0014\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0004H\u0086\bø\u0001\u0000\u001av\u0010\u0016\u001a\u00020\u0001*\u00020\u00022d\b\u0004\u0010\u0014\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\r0\u0004H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"addTextChangedListener", "Landroid/text/TextWatcher;", "Landroid/widget/TextView;", "beforeTextChanged", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "text", "", "start", "count", "after", "", "onTextChanged", "before", "afterTextChanged", "Lkotlin/Function1;", "Landroid/text/Editable;", "doAfterTextChanged", "action", "doBeforeTextChanged", "doOnTextChanged", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class TextViewKt {




    @org.jetbrains.annotations.NotNull
    public static final android.text.TextWatcher addTextChangedListener(@org.jetbrains.annotations.NotNull android.widget.TextView r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "beforeTextChanged"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "onTextChanged"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "afterTextChanged"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1 r0 = new androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1
            r0.<init>(r4, r2, r3)
            r1.addTextChangedListener(r0)
            return r0
    }

    public static /* synthetic */ android.text.TextWatcher addTextChangedListener$default(android.widget.TextView r0, kotlin.jvm.functions.Function4 r1, kotlin.jvm.functions.Function4 r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            androidx.core.widget.TextViewKt$addTextChangedListener$1 r1 = androidx.core.widget.TextViewKt.AnonymousClass1.INSTANCE
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            androidx.core.widget.TextViewKt$addTextChangedListener$2 r2 = androidx.core.widget.TextViewKt.AnonymousClass2.INSTANCE
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            androidx.core.widget.TextViewKt$addTextChangedListener$3 r3 = androidx.core.widget.TextViewKt.AnonymousClass3.INSTANCE
        L12:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "beforeTextChanged"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "onTextChanged"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "afterTextChanged"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1 r4 = new androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1
            r4.<init>(r3, r1, r2)
            r0.addTextChangedListener(r4)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.TextWatcher doAfterTextChanged(@org.jetbrains.annotations.NotNull android.widget.TextView r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.Unit> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1 r0 = new androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1
            r0.<init>(r2)
            r1.addTextChangedListener(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.TextWatcher doBeforeTextChanged(@org.jetbrains.annotations.NotNull android.widget.TextView r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1 r0 = new androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1
            r0.<init>(r2)
            r1.addTextChangedListener(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.TextWatcher doOnTextChanged(@org.jetbrains.annotations.NotNull android.widget.TextView r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1 r0 = new androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1
            r0.<init>(r2)
            r1.addTextChangedListener(r0)
            return r0
    }
}
