package kotlin.collections;

/* JADX INFO: compiled from: CollectionsJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/collections/CollectionSystemProperties;", "", "()V", "brittleContainsOptimizationEnabled", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CollectionSystemProperties {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.CollectionSystemProperties INSTANCE = null;

    @kotlin.jvm.JvmField
    public static final boolean brittleContainsOptimizationEnabled = false;

    static {
            kotlin.collections.CollectionSystemProperties r0 = new kotlin.collections.CollectionSystemProperties
            r0.<init>()
            kotlin.collections.CollectionSystemProperties.INSTANCE = r0
            java.lang.String r0 = "kotlin.collections.convert_arg_to_set_in_removeAll"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L14
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            goto L15
        L14:
            r0 = 0
        L15:
            kotlin.collections.CollectionSystemProperties.brittleContainsOptimizationEnabled = r0
            return
    }

    private CollectionSystemProperties() {
            r0 = this;
            r0.<init>()
            return
    }
}
