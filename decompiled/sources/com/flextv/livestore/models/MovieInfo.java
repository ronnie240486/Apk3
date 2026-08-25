package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes2.dex */
public class MovieInfo implements java.io.Serializable {
    private java.lang.String actors;
    private java.lang.String age;
    private java.lang.String backdrop;
    private java.util.List<java.lang.String> backdrop_path;
    private java.lang.String cast;
    private java.lang.String category_id;
    private java.lang.String country;
    private java.lang.String cover_big;
    private java.lang.String description;
    private java.lang.String director;
    private java.lang.String duration;
    private java.lang.String duration_secs;
    private java.lang.String episode_run_time;
    private java.lang.String genre;
    private java.lang.String kinopoisk_url;
    private java.lang.String movie_image;
    private java.lang.String name;
    private java.lang.String o_name;
    private java.lang.String plot;
    private java.lang.String rating;
    private java.lang.String rating_count_kinopoisk;
    private java.lang.String rating_mpaa;
    private java.lang.String releasedate;
    private java.lang.String tmdb_id;
    private java.lang.String youtube_trailer;

    public MovieInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getAge() {
            r1 = this;
            java.lang.String r0 = r1.age
            if (r0 != 0) goto L6
            java.lang.String r0 = ""
        L6:
            return r0
    }

    public java.lang.String getBackdrop() {
            r1 = this;
            java.lang.String r0 = r1.backdrop
            return r0
    }

    public java.lang.String getCast() {
            r1 = this;
            java.lang.String r0 = r1.cast
            if (r0 != 0) goto L6
            java.lang.String r0 = ""
        L6:
            return r0
    }

    public java.lang.String getCategory_id() {
            r1 = this;
            java.lang.String r0 = r1.category_id
            return r0
    }

    public java.lang.String getCountry() {
            r1 = this;
            java.lang.String r0 = r1.country
            return r0
    }

    public java.lang.String getCover_big() {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.backdrop_path
            if (r0 == 0) goto L15
            int r0 = r0.size()
            if (r0 != 0) goto Lb
            goto L15
        Lb:
            java.util.List<java.lang.String> r0 = r2.backdrop_path
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L15:
            java.lang.String r0 = r2.backdrop
            if (r0 == 0) goto L23
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L20
            goto L23
        L20:
            java.lang.String r0 = r2.backdrop
            return r0
        L23:
            java.lang.String r0 = r2.cover_big
            if (r0 == 0) goto L31
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2e
            goto L31
        L2e:
            java.lang.String r0 = r2.cover_big
            return r0
        L31:
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.description
            if (r0 == 0) goto Le
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto Le
        Lb:
            java.lang.String r0 = r1.description
            return r0
        Le:
            java.lang.String r0 = r1.plot
            if (r0 != 0) goto L14
            java.lang.String r0 = ""
        L14:
            return r0
    }

    public java.lang.String getDirector() {
            r1 = this;
            java.lang.String r0 = r1.director
            return r0
    }

    public java.lang.String getDuration() {
            r1 = this;
            java.lang.String r0 = r1.duration
            return r0
    }

    public java.lang.String getDuration_secs() {
            r1 = this;
            java.lang.String r0 = r1.duration_secs
            if (r0 != 0) goto L6
            java.lang.String r0 = ""
        L6:
            return r0
    }

    public java.lang.String getGenre() {
            r1 = this;
            java.lang.String r0 = r1.genre
            if (r0 != 0) goto L6
            java.lang.String r0 = ""
        L6:
            return r0
    }

    public java.lang.String getKinopoisk_url() {
            r1 = this;
            java.lang.String r0 = r1.kinopoisk_url
            return r0
    }

    public java.lang.String getMovie_image() {
            r1 = this;
            java.lang.String r0 = r1.movie_image
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.lang.String getO_name() {
            r1 = this;
            java.lang.String r0 = r1.o_name
            return r0
    }

    public java.lang.String getPlot() {
            r1 = this;
            java.lang.String r0 = r1.plot
            return r0
    }

    public float getRating() {
            r2 = this;
            java.lang.String r0 = r2.rating
            if (r0 == 0) goto L15
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L15
        Lb:
            java.lang.String r0 = r2.rating
            float r0 = java.lang.Float.parseFloat(r0)
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            return r0
        L15:
            r0 = 0
            return r0
    }

    public java.lang.String getRating_count_kinopoisk() {
            r1 = this;
            java.lang.String r0 = r1.rating_count_kinopoisk
            return r0
    }

    public java.lang.String getRating_mpaa() {
            r1 = this;
            java.lang.String r0 = r1.rating_mpaa
            return r0
    }

    public java.lang.String getReleasedate() {
            r1 = this;
            java.lang.String r0 = r1.releasedate
            if (r0 != 0) goto L6
            java.lang.String r0 = ""
        L6:
            return r0
    }

    public java.lang.String getTmdb_id() {
            r1 = this;
            java.lang.String r0 = r1.tmdb_id
            if (r0 != 0) goto L6
            java.lang.String r0 = ""
        L6:
            return r0
    }

    public java.lang.String getYoutube_trailer() {
            r1 = this;
            java.lang.String r0 = r1.youtube_trailer
            if (r0 != 0) goto L6
            java.lang.String r0 = ""
        L6:
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "MovieInfo{movie_image='"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r4.movie_image
            r2 = 39
            java.lang.String r3 = ", youtube_trailer='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.youtube_trailer
            java.lang.String r3 = ", genre='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.genre
            java.lang.String r3 = ", plot='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.plot
            java.lang.String r3 = ", cast='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.cast
            java.lang.String r3 = ", rating='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.rating
            java.lang.String r3 = ", director='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.director
            java.lang.String r3 = ", releasedate='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.releasedate
            java.lang.String r3 = ", tmdb_id='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.tmdb_id
            java.lang.String r3 = ", kinopoisk_url='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.kinopoisk_url
            java.lang.String r3 = ", name='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.name
            java.lang.String r3 = ", o_name='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.o_name
            java.lang.String r3 = ", cover_big='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.cover_big
            java.lang.String r3 = ", episode_run_time='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.episode_run_time
            java.lang.String r3 = ", actors='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.actors
            java.lang.String r3 = ", description='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.description
            java.lang.String r3 = ", age='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.age
            java.lang.String r3 = ", rating_mpaa='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.rating_mpaa
            java.lang.String r3 = ", rating_count_kinopoisk='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.rating_count_kinopoisk
            java.lang.String r3 = ", country='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.country
            java.lang.String r3 = ", duration='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.duration
            java.lang.String r3 = ", backdrop='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.backdrop
            java.lang.String r3 = ", duration_secs='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.duration_secs
            java.lang.String r3 = ", backdrop_path='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.util.List<java.lang.String> r1 = r4.backdrop_path
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", category_id='"
            r0.append(r1)
            java.lang.String r1 = r4.category_id
            r0.append(r1)
            r0.append(r2)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
