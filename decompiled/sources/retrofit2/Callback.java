package retrofit2;

/* JADX INFO: loaded from: classes2.dex */
public interface Callback<T> {
    void onFailure(retrofit2.Call<T> r1, java.lang.Throwable r2);

    void onResponse(retrofit2.Call<T> r1, retrofit2.Response<T> r2);
}
