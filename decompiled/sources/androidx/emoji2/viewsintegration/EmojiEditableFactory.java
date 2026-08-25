package androidx.emoji2.viewsintegration;

/* JADX INFO: loaded from: classes.dex */
final class EmojiEditableFactory extends android.text.Editable.Factory {
    private static final java.lang.Object INSTANCE_LOCK = null;

    @androidx.annotation.GuardedBy("INSTANCE_LOCK")
    private static volatile android.text.Editable.Factory sInstance;

    @androidx.annotation.Nullable
    private static java.lang.Class<?> sWatcherClass;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.emoji2.viewsintegration.EmojiEditableFactory.INSTANCE_LOCK = r0
            return
    }

    @android.annotation.SuppressLint({"PrivateApi"})
    private EmojiEditableFactory() {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "android.text.DynamicLayout$ChangeWatcher"
            r1 = 0
            java.lang.Class<androidx.emoji2.viewsintegration.EmojiEditableFactory> r2 = androidx.emoji2.viewsintegration.EmojiEditableFactory.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r2)     // Catch: java.lang.Throwable -> L12
            androidx.emoji2.viewsintegration.EmojiEditableFactory.sWatcherClass = r0     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }

    public static android.text.Editable.Factory getInstance() {
            android.text.Editable$Factory r0 = androidx.emoji2.viewsintegration.EmojiEditableFactory.sInstance
            if (r0 != 0) goto L17
            java.lang.Object r0 = androidx.emoji2.viewsintegration.EmojiEditableFactory.INSTANCE_LOCK
            monitor-enter(r0)
            android.text.Editable$Factory r1 = androidx.emoji2.viewsintegration.EmojiEditableFactory.sInstance     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            androidx.emoji2.viewsintegration.EmojiEditableFactory r1 = new androidx.emoji2.viewsintegration.EmojiEditableFactory     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            androidx.emoji2.viewsintegration.EmojiEditableFactory.sInstance = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            android.text.Editable$Factory r0 = androidx.emoji2.viewsintegration.EmojiEditableFactory.sInstance
            return r0
    }

    @Override // android.text.Editable.Factory
    public android.text.Editable newEditable(@androidx.annotation.NonNull java.lang.CharSequence r2) {
            r1 = this;
            java.lang.Class<?> r0 = androidx.emoji2.viewsintegration.EmojiEditableFactory.sWatcherClass
            if (r0 == 0) goto L9
            androidx.emoji2.text.SpannableBuilder r2 = androidx.emoji2.text.SpannableBuilder.create(r0, r2)
            return r2
        L9:
            android.text.Editable r2 = super.newEditable(r2)
            return r2
    }
}
