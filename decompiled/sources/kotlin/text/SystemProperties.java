package kotlin.text;

/* JADX INFO: compiled from: StringBuilderJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/text/SystemProperties;", "", "()V", "LINE_SEPARATOR", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class SystemProperties {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.text.SystemProperties INSTANCE = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LINE_SEPARATOR = null;

    static {
            kotlin.text.SystemProperties r0 = new kotlin.text.SystemProperties
            r0.<init>()
            kotlin.text.SystemProperties.INSTANCE = r0
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            kotlin.text.SystemProperties.LINE_SEPARATOR = r0
            return
    }

    private SystemProperties() {
            r0 = this;
            r0.<init>()
            return
    }
}
