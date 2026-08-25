package androidx.core.widget;

/* JADX INFO: compiled from: TextView.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", "after", "onTextChanged", "before", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 176)
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements android.text.TextWatcher {
    public final /* synthetic */ kotlin.jvm.functions.Function1<android.text.Editable, kotlin.Unit> $afterTextChanged;
    public final /* synthetic */ kotlin.jvm.functions.Function4<java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Unit> $beforeTextChanged;
    public final /* synthetic */ kotlin.jvm.functions.Function4<java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Unit> $onTextChanged;

    public TextViewKt$addTextChangedListener$textWatcher$1(kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.Unit> r1, kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r2, kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r3) {
            r0 = this;
            r0.$afterTextChanged = r1
            r0.$beforeTextChanged = r2
            r0.$onTextChanged = r3
            r0.<init>()
            return
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@org.jetbrains.annotations.Nullable android.text.Editable r2) {
            r1 = this;
            kotlin.jvm.functions.Function1<android.text.Editable, kotlin.Unit> r0 = r1.$afterTextChanged
            r0.invoke(r2)
            return
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@org.jetbrains.annotations.Nullable java.lang.CharSequence r2, int r3, int r4, int r5) {
            r1 = this;
            kotlin.jvm.functions.Function4<java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Unit> r0 = r1.$beforeTextChanged
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.invoke(r2, r3, r4, r5)
            return
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@org.jetbrains.annotations.Nullable java.lang.CharSequence r2, int r3, int r4, int r5) {
            r1 = this;
            kotlin.jvm.functions.Function4<java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Unit> r0 = r1.$onTextChanged
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.invoke(r2, r3, r4, r5)
            return
    }
}
