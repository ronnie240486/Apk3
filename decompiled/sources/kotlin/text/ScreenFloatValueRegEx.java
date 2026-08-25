package kotlin.text;

/* JADX INFO: compiled from: StringNumberConversionsJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/text/ScreenFloatValueRegEx;", "", "()V", "value", "Lkotlin/text/Regex;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class ScreenFloatValueRegEx {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.text.ScreenFloatValueRegEx INSTANCE = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.text.Regex value = null;

    static {
            kotlin.text.ScreenFloatValueRegEx r0 = new kotlin.text.ScreenFloatValueRegEx
            r0.<init>()
            kotlin.text.ScreenFloatValueRegEx.INSTANCE = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            java.lang.String r1 = "(\\p{Digit}+)"
            r0.append(r1)
            java.lang.String r2 = "(\\.)?("
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "?)("
            r0.append(r2)
            java.lang.String r2 = "[eE][+-]?(\\p{Digit}+)"
            java.lang.String r3 = ")?)|(\\.("
            java.lang.String r4 = ")("
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r3, r1, r4)
            java.lang.String r3 = ")?)|(("
            java.lang.String r4 = "(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))"
            java.lang.String r5 = ")[pP][+-]?"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r3, r4, r5)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "[\\x00-\\x20]*[+-]?(NaN|Infinity|(("
            java.lang.String r2 = ")[fFdD]?))[\\x00-\\x20]*"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r2)
            kotlin.text.Regex r1 = new kotlin.text.Regex
            r1.<init>(r0)
            kotlin.text.ScreenFloatValueRegEx.value = r1
            return
    }

    private ScreenFloatValueRegEx() {
            r0 = this;
            r0.<init>()
            return
    }
}
