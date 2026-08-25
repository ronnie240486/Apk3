package retrofit2;

/* JADX INFO: loaded from: classes3.dex */
public interface Call<T> extends java.lang.Cloneable {
    void cancel();

    /* JADX INFO: renamed from: clone */
    retrofit2.Call<T> mo2037clone();

    void enqueue(retrofit2.Callback<T> r1);

    retrofit2.Response<T> execute() throws java.io.IOException;

    boolean isCanceled();

    boolean isExecuted();

    okhttp3.Request request();

    okio.Timeout timeout();
}
