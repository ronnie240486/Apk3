package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class TaskStackBuilder implements java.lang.Iterable<android.content.Intent> {
    private static final java.lang.String TAG = "TaskStackBuilder";
    private final java.util.ArrayList<android.content.Intent> mIntents;
    private final android.content.Context mSourceContext;

    @androidx.annotation.RequiresApi(16)
    public static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.app.PendingIntent getActivities(android.content.Context r0, int r1, android.content.Intent[] r2, int r3, android.os.Bundle r4) {
                android.app.PendingIntent r0 = android.app.PendingIntent.getActivities(r0, r1, r2, r3, r4)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface SupportParentable {
        @androidx.annotation.Nullable
        android.content.Intent getSupportParentActivityIntent();
    }

    private TaskStackBuilder(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mIntents = r0
            r1.mSourceContext = r2
            return
    }

    @androidx.annotation.NonNull
    public static androidx.core.app.TaskStackBuilder create(@androidx.annotation.NonNull android.content.Context r1) {
            androidx.core.app.TaskStackBuilder r0 = new androidx.core.app.TaskStackBuilder
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    public static androidx.core.app.TaskStackBuilder from(android.content.Context r0) {
            androidx.core.app.TaskStackBuilder r0 = create(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.core.app.TaskStackBuilder addNextIntent(@androidx.annotation.NonNull android.content.Intent r2) {
            r1 = this;
            java.util.ArrayList<android.content.Intent> r0 = r1.mIntents
            r0.add(r2)
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.app.TaskStackBuilder addNextIntentWithParentStack(@androidx.annotation.NonNull android.content.Intent r2) {
            r1 = this;
            android.content.ComponentName r0 = r2.getComponent()
            if (r0 != 0) goto L10
            android.content.Context r0 = r1.mSourceContext
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.ComponentName r0 = r2.resolveActivity(r0)
        L10:
            if (r0 == 0) goto L15
            r1.addParentStack(r0)
        L15:
            r1.addNextIntent(r2)
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.app.TaskStackBuilder addParentStack(@androidx.annotation.NonNull android.app.Activity r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.core.app.TaskStackBuilder.SupportParentable
            if (r0 == 0) goto Lc
            r0 = r2
            androidx.core.app.TaskStackBuilder$SupportParentable r0 = (androidx.core.app.TaskStackBuilder.SupportParentable) r0
            android.content.Intent r0 = r0.getSupportParentActivityIntent()
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L13
            android.content.Intent r0 = androidx.core.app.NavUtils.getParentActivityIntent(r2)
        L13:
            if (r0 == 0) goto L2b
            android.content.ComponentName r2 = r0.getComponent()
            if (r2 != 0) goto L25
            android.content.Context r2 = r1.mSourceContext
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            android.content.ComponentName r2 = r0.resolveActivity(r2)
        L25:
            r1.addParentStack(r2)
            r1.addNextIntent(r0)
        L2b:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.app.TaskStackBuilder addParentStack(@androidx.annotation.NonNull android.content.ComponentName r3) {
            r2 = this;
            java.util.ArrayList<android.content.Intent> r0 = r2.mIntents
            int r0 = r0.size()
            android.content.Context r1 = r2.mSourceContext     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            android.content.Intent r3 = androidx.core.app.NavUtils.getParentActivityIntent(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
        Lc:
            if (r3 == 0) goto L1e
            java.util.ArrayList<android.content.Intent> r1 = r2.mIntents     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            r1.add(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            android.content.Context r1 = r2.mSourceContext     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            android.content.ComponentName r3 = r3.getComponent()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            android.content.Intent r3 = androidx.core.app.NavUtils.getParentActivityIntent(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            goto Lc
        L1e:
            return r2
        L1f:
            r3 = move-exception
            java.lang.String r0 = "TaskStackBuilder"
            java.lang.String r1 = "Bad ComponentName while traversing activity parent metadata"
            android.util.Log.e(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
    }

    @androidx.annotation.NonNull
    public androidx.core.app.TaskStackBuilder addParentStack(@androidx.annotation.NonNull java.lang.Class<?> r3) {
            r2 = this;
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.Context r1 = r2.mSourceContext
            r0.<init>(r1, r3)
            androidx.core.app.TaskStackBuilder r3 = r2.addParentStack(r0)
            return r3
    }

    @androidx.annotation.Nullable
    public android.content.Intent editIntentAt(int r2) {
            r1 = this;
            java.util.ArrayList<android.content.Intent> r0 = r1.mIntents
            java.lang.Object r2 = r0.get(r2)
            android.content.Intent r2 = (android.content.Intent) r2
            return r2
    }

    @java.lang.Deprecated
    public android.content.Intent getIntent(int r1) {
            r0 = this;
            android.content.Intent r1 = r0.editIntentAt(r1)
            return r1
    }

    public int getIntentCount() {
            r1 = this;
            java.util.ArrayList<android.content.Intent> r0 = r1.mIntents
            int r0 = r0.size()
            return r0
    }

    @androidx.annotation.NonNull
    public android.content.Intent[] getIntents() {
            r5 = this;
            java.util.ArrayList<android.content.Intent> r0 = r5.mIntents
            int r0 = r0.size()
            android.content.Intent[] r1 = new android.content.Intent[r0]
            if (r0 != 0) goto Lb
            return r1
        Lb:
            android.content.Intent r2 = new android.content.Intent
            java.util.ArrayList<android.content.Intent> r3 = r5.mIntents
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            android.content.Intent r3 = (android.content.Intent) r3
            r2.<init>(r3)
            r3 = 268484608(0x1000c000, float:2.539146E-29)
            android.content.Intent r2 = r2.addFlags(r3)
            r1[r4] = r2
            r2 = 1
        L23:
            if (r2 >= r0) goto L37
            android.content.Intent r3 = new android.content.Intent
            java.util.ArrayList<android.content.Intent> r4 = r5.mIntents
            java.lang.Object r4 = r4.get(r2)
            android.content.Intent r4 = (android.content.Intent) r4
            r3.<init>(r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L23
        L37:
            return r1
    }

    @androidx.annotation.Nullable
    public android.app.PendingIntent getPendingIntent(int r2, int r3) {
            r1 = this;
            r0 = 0
            android.app.PendingIntent r2 = r1.getPendingIntent(r2, r3, r0)
            return r2
    }

    @androidx.annotation.Nullable
    public android.app.PendingIntent getPendingIntent(int r5, int r6, @androidx.annotation.Nullable android.os.Bundle r7) {
            r4 = this;
            java.util.ArrayList<android.content.Intent> r0 = r4.mIntents
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2a
            java.util.ArrayList<android.content.Intent> r0 = r4.mIntents
            r1 = 0
            android.content.Intent[] r2 = new android.content.Intent[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            android.content.Intent[] r0 = (android.content.Intent[]) r0
            android.content.Intent r2 = new android.content.Intent
            r3 = r0[r1]
            r2.<init>(r3)
            r3 = 268484608(0x1000c000, float:2.539146E-29)
            android.content.Intent r2 = r2.addFlags(r3)
            r0[r1] = r2
            android.content.Context r1 = r4.mSourceContext
            android.app.PendingIntent r5 = androidx.core.app.TaskStackBuilder.Api16Impl.getActivities(r1, r5, r0, r6, r7)
            return r5
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "No intents added to TaskStackBuilder; cannot getPendingIntent"
            r5.<init>(r6)
            throw r5
    }

    @Override // java.lang.Iterable
    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public java.util.Iterator<android.content.Intent> iterator() {
            r1 = this;
            java.util.ArrayList<android.content.Intent> r0 = r1.mIntents
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public void startActivities() {
            r1 = this;
            r0 = 0
            r1.startActivities(r0)
            return
    }

    public void startActivities(@androidx.annotation.Nullable android.os.Bundle r5) {
            r4 = this;
            java.util.ArrayList<android.content.Intent> r0 = r4.mIntents
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L40
            java.util.ArrayList<android.content.Intent> r0 = r4.mIntents
            r1 = 0
            android.content.Intent[] r2 = new android.content.Intent[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            android.content.Intent[] r0 = (android.content.Intent[]) r0
            android.content.Intent r2 = new android.content.Intent
            r3 = r0[r1]
            r2.<init>(r3)
            r3 = 268484608(0x1000c000, float:2.539146E-29)
            android.content.Intent r2 = r2.addFlags(r3)
            r0[r1] = r2
            android.content.Context r1 = r4.mSourceContext
            boolean r5 = androidx.core.content.ContextCompat.startActivities(r1, r0, r5)
            if (r5 != 0) goto L3f
            android.content.Intent r5 = new android.content.Intent
            int r1 = r0.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            r5.<init>(r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r5.addFlags(r0)
            android.content.Context r0 = r4.mSourceContext
            r0.startActivity(r5)
        L3f:
            return
        L40:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "No intents added to TaskStackBuilder; cannot startActivities"
            r5.<init>(r0)
            throw r5
    }
}
