package okhttp3.internal.connection;

/* JADX INFO: compiled from: RouteDatabase.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/internal/connection/RouteDatabase;", "", "()V", "failedRoutes", "", "Lokhttp3/Route;", "connected", "", "route", "failed", "failedRoute", "shouldPostpone", "", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class RouteDatabase {
    private final java.util.Set<okhttp3.Route> failedRoutes;

    public RouteDatabase() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.failedRoutes = r0
            return
    }

    public final synchronized void connected(@org.jetbrains.annotations.NotNull okhttp3.Route r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "route"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> Le
            java.util.Set<okhttp3.Route> r0 = r1.failedRoutes     // Catch: java.lang.Throwable -> Le
            r0.remove(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        Le:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void failed(@org.jetbrains.annotations.NotNull okhttp3.Route r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "failedRoute"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> Ld
            java.util.Set<okhttp3.Route> r0 = r1.failedRoutes     // Catch: java.lang.Throwable -> Ld
            r0.add(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized boolean shouldPostpone(@org.jetbrains.annotations.NotNull okhttp3.Route r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "route"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> Lf
            java.util.Set<okhttp3.Route> r0 = r1.failedRoutes     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r2
        Lf:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
