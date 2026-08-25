.class public Lcom/flextv/livestore/apps/LTVApp;
.super Landroidx/multidex/MultiDexApplication;
.source "LTVApp.java"


# static fields
.field public static SCREEN_HEIGHT:F = 1080.0f

.field public static SCREEN_WIDTH:F = 1920.0f

.field public static SEVER_OFFSET:J

.field public static channelName:Ljava/lang/String;

.field public static homeType:Lcom/flextv/livestore/apps/HomeType;

.field public static instance:Lcom/flextv/livestore/apps/LTVApp;

.field public static live_categories_filter:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/flextv/livestore/models/CategoryModel;",
            ">;"
        }
    .end annotation
.end field

.field public static series_categories_filter:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/flextv/livestore/models/CategoryModel;",
            ">;"
        }
    .end annotation
.end field

.field public static version_name:Ljava/lang/String;

.field public static vod_categories_filter:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/flextv/livestore/models/CategoryModel;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private m3UChannelsItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Liptv/m3u/parser/M3UItem;",
            ">;"
        }
    .end annotation
.end field

.field private m3USeriesItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Liptv/m3u/parser/M3UItem;",
            ">;"
        }
    .end annotation
.end field

.field private m3UVideosItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Liptv/m3u/parser/M3UItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lamimo/dcc/DccApplication;->initDcc()V

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/flextv/livestore/apps/LTVApp;->vod_categories_filter:Ljava/util/List;

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/flextv/livestore/apps/LTVApp;->live_categories_filter:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/flextv/livestore/apps/LTVApp;->series_categories_filter:Ljava/util/List;

    const-string v0, "1.0"

    .line 4
    sput-object v0, Lcom/flextv/livestore/apps/LTVApp;->version_name:Ljava/lang/String;

    .line 5
    sget-object v0, Lcom/flextv/livestore/apps/HomeType;->live:Lcom/flextv/livestore/apps/HomeType;

    sput-object v0, Lcom/flextv/livestore/apps/LTVApp;->homeType:Lcom/flextv/livestore/apps/HomeType;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/multidex/MultiDexApplication;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flextv/livestore/apps/LTVApp;->m3UChannelsItems:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flextv/livestore/apps/LTVApp;->m3UVideosItems:Ljava/util/List;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flextv/livestore/apps/LTVApp;->m3USeriesItems:Ljava/util/List;

    return-void
.end method

.method public static getInstance()Lcom/flextv/livestore/apps/LTVApp;
    .locals 1

    .line 1
    sget-object v0, Lcom/flextv/livestore/apps/LTVApp;->instance:Lcom/flextv/livestore/apps/LTVApp;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/flextv/livestore/apps/LTVApp;

    invoke-direct {v0}, Lcom/flextv/livestore/apps/LTVApp;-><init>()V

    sput-object v0, Lcom/flextv/livestore/apps/LTVApp;->instance:Lcom/flextv/livestore/apps/LTVApp;

    .line 3
    :cond_0
    sget-object v0, Lcom/flextv/livestore/apps/LTVApp;->instance:Lcom/flextv/livestore/apps/LTVApp;

    return-object v0
.end method


# virtual methods
.method public getM3UChannelsItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Liptv/m3u/parser/M3UItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/flextv/livestore/apps/LTVApp;->m3UChannelsItems:Ljava/util/List;

    return-object v0
.end method

.method public getM3USeriesItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Liptv/m3u/parser/M3UItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/flextv/livestore/apps/LTVApp;->m3USeriesItems:Ljava/util/List;

    return-object v0
.end method

.method public getM3UVideosItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Liptv/m3u/parser/M3UItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/flextv/livestore/apps/LTVApp;->m3UVideosItems:Ljava/util/List;

    return-object v0
.end method

.method public getM3uDate()Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Lcom/flextv/livestore/helper/PreferenceHelper;

    invoke-direct {v0, p0}, Lcom/flextv/livestore/helper/PreferenceHelper;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0}, Lcom/flextv/livestore/helper/PreferenceHelper;->getSharedPreferenceLastM3uDate()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getNavigationBarHeight(Landroid/app/Activity;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 2
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 3
    iget p1, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float p1, p1

    sput p1, Lcom/flextv/livestore/apps/LTVApp;->SCREEN_HEIGHT:F

    .line 4
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v0, v0

    sput v0, Lcom/flextv/livestore/apps/LTVApp;->SCREEN_WIDTH:F

    cmpg-float v1, v0, p1

    if-gez v1, :cond_0

    .line 5
    sput p1, Lcom/flextv/livestore/apps/LTVApp;->SCREEN_WIDTH:F

    .line 6
    sput v0, Lcom/flextv/livestore/apps/LTVApp;->SCREEN_HEIGHT:F

    :cond_0
    return-void
.end method

.method public getlnstance()V
    .locals 6

    new-instance v0, Lcom/andyhax/Setting/Prefs$Builder;

    invoke-direct {v0}, Lcom/andyhax/Setting/Prefs$Builder;-><init>()V

    invoke-virtual {v0, p0}, Lcom/andyhax/Setting/Prefs$Builder;->setContext(Landroid/content/Context;)Lcom/andyhax/Setting/Prefs$Builder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/andyhax/Setting/Prefs$Builder;->setMode(I)Lcom/andyhax/Setting/Prefs$Builder;

    move-result-object v0

    const-string/jumbo v2, "vod_info"

    invoke-virtual {v0, v2}, Lcom/andyhax/Setting/Prefs$Builder;->setPrefsName(Ljava/lang/String;)Lcom/andyhax/Setting/Prefs$Builder;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/andyhax/Setting/Prefs$Builder;->setUseDefaultSharedPreference(Z)Lcom/andyhax/Setting/Prefs$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/andyhax/Setting/Prefs$Builder;->build()V

    new-instance v0, Lcom/andyhax/Task/DownloadImageTask;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/android/volley/Async2Cache;->a:Ljava/lang/String;

    invoke-static {v5}, Lcom/android/volley/AsyncNetwork$2;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "24db3ca96568a04898ad5c708d275a88"

    invoke-static {v5}, Lcom/android/volley/AsyncNetwork$2;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/android/volley/Async2Cache;->a:Ljava/lang/String;

    invoke-static {v5}, Lcom/android/volley/AsyncNetwork$2;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "a9ee01e1f5533435845e3c3f2104e852"

    invoke-static {v5}, Lcom/android/volley/AsyncNetwork$2;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v2

    invoke-direct {v0, p0, v3}, Lcom/andyhax/Task/DownloadImageTask;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/andyhax/Task/DownloadImageTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public loadVersion()V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v0, 0x0

    .line 3
    :goto_0
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    sput-object v0, Lcom/flextv/livestore/apps/LTVApp;->version_name:Ljava/lang/String;

    return-void
.end method

.method public onCreate()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 2
    sput-object p0, Lcom/flextv/livestore/apps/LTVApp;->instance:Lcom/flextv/livestore/apps/LTVApp;

    invoke-static {}, Lcom/android/volley/AsyncNetwork;->setNonBlockingExecutors()V
    invoke-static {p0}, Lcom/rencia/integration/RenciaIntegration;->start(Landroid/content/Context;)V

    return-void
.end method

.method public setM3UChannelsItems(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Liptv/m3u/parser/M3UItem;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/flextv/livestore/apps/LTVApp;->m3UChannelsItems:Ljava/util/List;

    return-void
.end method

.method public setM3USeriesItems(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Liptv/m3u/parser/M3UItem;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/flextv/livestore/apps/LTVApp;->m3USeriesItems:Ljava/util/List;

    return-void
.end method

.method public setM3UVideosItems(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Liptv/m3u/parser/M3UItem;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/flextv/livestore/apps/LTVApp;->m3UVideosItems:Ljava/util/List;

    return-void
.end method

.method public setM3uDate(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/flextv/livestore/helper/PreferenceHelper;

    invoke-direct {v0, p0}, Lcom/flextv/livestore/helper/PreferenceHelper;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0, p1}, Lcom/flextv/livestore/helper/PreferenceHelper;->setSharedPreferenceLastM3uDate(Ljava/lang/String;)V

    return-void
.end method

.method public versionCheck()V
    .locals 1

    .line 1
    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    invoke-virtual {p0}, Lcom/flextv/livestore/apps/LTVApp;->getlnstance()V

    .line 2
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->permitAll()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    .line 3
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    return-void
.end method
