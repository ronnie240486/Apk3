package androidx.exifinterface.media;

/* JADX INFO: loaded from: classes2.dex */
public class ExifInterface {
    public static final short ALTITUDE_ABOVE_SEA_LEVEL = 0;
    public static final short ALTITUDE_BELOW_SEA_LEVEL = 1;
    public static final java.nio.charset.Charset ASCII = null;
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_1 = null;
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_2 = null;
    public static final int[] BITS_PER_SAMPLE_RGB = null;
    public static final int COLOR_SPACE_S_RGB = 1;
    public static final int COLOR_SPACE_UNCALIBRATED = 65535;
    public static final short CONTRAST_HARD = 2;
    public static final short CONTRAST_NORMAL = 0;
    public static final short CONTRAST_SOFT = 1;
    public static final int DATA_DEFLATE_ZIP = 8;
    public static final int DATA_HUFFMAN_COMPRESSED = 2;
    public static final int DATA_JPEG = 6;
    public static final int DATA_JPEG_COMPRESSED = 7;
    public static final int DATA_LOSSY_JPEG = 34892;
    public static final int DATA_PACK_BITS_COMPRESSED = 32773;
    public static final int DATA_UNCOMPRESSED = 1;
    private static final boolean DEBUG = false;
    public static final byte[] EXIF_ASCII_PREFIX = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] EXIF_POINTER_TAGS = null;
    public static final androidx.exifinterface.media.ExifInterface.ExifTag[][] EXIF_TAGS = null;
    public static final short EXPOSURE_MODE_AUTO = 0;
    public static final short EXPOSURE_MODE_AUTO_BRACKET = 2;
    public static final short EXPOSURE_MODE_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_ACTION = 6;
    public static final short EXPOSURE_PROGRAM_APERTURE_PRIORITY = 3;
    public static final short EXPOSURE_PROGRAM_CREATIVE = 5;
    public static final short EXPOSURE_PROGRAM_LANDSCAPE_MODE = 8;
    public static final short EXPOSURE_PROGRAM_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_NORMAL = 2;
    public static final short EXPOSURE_PROGRAM_NOT_DEFINED = 0;
    public static final short EXPOSURE_PROGRAM_PORTRAIT_MODE = 7;
    public static final short EXPOSURE_PROGRAM_SHUTTER_PRIORITY = 4;
    public static final short FILE_SOURCE_DSC = 3;
    public static final short FILE_SOURCE_OTHER = 0;
    public static final short FILE_SOURCE_REFLEX_SCANNER = 2;
    public static final short FILE_SOURCE_TRANSPARENT_SCANNER = 1;
    public static final short FLAG_FLASH_FIRED = 1;
    public static final short FLAG_FLASH_MODE_AUTO = 24;
    public static final short FLAG_FLASH_MODE_COMPULSORY_FIRING = 8;
    public static final short FLAG_FLASH_MODE_COMPULSORY_SUPPRESSION = 16;
    public static final short FLAG_FLASH_NO_FLASH_FUNCTION = 32;
    public static final short FLAG_FLASH_RED_EYE_SUPPORTED = 64;
    public static final short FLAG_FLASH_RETURN_LIGHT_DETECTED = 6;
    public static final short FLAG_FLASH_RETURN_LIGHT_NOT_DETECTED = 4;
    private static final java.util.List<java.lang.Integer> FLIPPED_ROTATION_ORDER = null;
    public static final short FORMAT_CHUNKY = 1;
    public static final short FORMAT_PLANAR = 2;
    public static final short GAIN_CONTROL_HIGH_GAIN_DOWN = 4;
    public static final short GAIN_CONTROL_HIGH_GAIN_UP = 2;
    public static final short GAIN_CONTROL_LOW_GAIN_DOWN = 3;
    public static final short GAIN_CONTROL_LOW_GAIN_UP = 1;
    public static final short GAIN_CONTROL_NONE = 0;
    public static final java.lang.String GPS_DIRECTION_MAGNETIC = "M";
    public static final java.lang.String GPS_DIRECTION_TRUE = "T";
    public static final java.lang.String GPS_DISTANCE_KILOMETERS = "K";
    public static final java.lang.String GPS_DISTANCE_MILES = "M";
    public static final java.lang.String GPS_DISTANCE_NAUTICAL_MILES = "N";
    public static final java.lang.String GPS_MEASUREMENT_2D = "2";
    public static final java.lang.String GPS_MEASUREMENT_3D = "3";
    public static final short GPS_MEASUREMENT_DIFFERENTIAL_CORRECTED = 1;
    public static final java.lang.String GPS_MEASUREMENT_INTERRUPTED = "V";
    public static final java.lang.String GPS_MEASUREMENT_IN_PROGRESS = "A";
    public static final short GPS_MEASUREMENT_NO_DIFFERENTIAL = 0;
    public static final java.lang.String GPS_SPEED_KILOMETERS_PER_HOUR = "K";
    public static final java.lang.String GPS_SPEED_KNOTS = "N";
    public static final java.lang.String GPS_SPEED_MILES_PER_HOUR = "M";
    private static final byte[] HEIF_BRAND_HEIC = null;
    private static final byte[] HEIF_BRAND_MIF1 = null;
    private static final byte[] HEIF_TYPE_FTYP = null;
    public static final byte[] IDENTIFIER_EXIF_APP1 = null;
    private static final byte[] IDENTIFIER_XMP_APP1 = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_EXIF_TAGS = null;
    private static final int IFD_FORMAT_BYTE = 1;
    public static final int[] IFD_FORMAT_BYTES_PER_FORMAT = null;
    private static final int IFD_FORMAT_DOUBLE = 12;
    private static final int IFD_FORMAT_IFD = 13;
    public static final java.lang.String[] IFD_FORMAT_NAMES = null;
    private static final int IFD_FORMAT_SBYTE = 6;
    private static final int IFD_FORMAT_SINGLE = 11;
    private static final int IFD_FORMAT_SLONG = 9;
    private static final int IFD_FORMAT_SRATIONAL = 10;
    private static final int IFD_FORMAT_SSHORT = 8;
    private static final int IFD_FORMAT_STRING = 2;
    private static final int IFD_FORMAT_ULONG = 4;
    private static final int IFD_FORMAT_UNDEFINED = 7;
    private static final int IFD_FORMAT_URATIONAL = 5;
    private static final int IFD_FORMAT_USHORT = 3;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_GPS_TAGS = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_INTEROPERABILITY_TAGS = null;
    private static final int IFD_OFFSET = 8;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_THUMBNAIL_TAGS = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_TIFF_TAGS = null;
    private static final int IFD_TYPE_EXIF = 1;
    private static final int IFD_TYPE_GPS = 2;
    private static final int IFD_TYPE_INTEROPERABILITY = 3;
    private static final int IFD_TYPE_ORF_CAMERA_SETTINGS = 7;
    private static final int IFD_TYPE_ORF_IMAGE_PROCESSING = 8;
    private static final int IFD_TYPE_ORF_MAKER_NOTE = 6;
    private static final int IFD_TYPE_PEF = 9;
    private static final int IMAGE_TYPE_ARW = 1;
    private static final int IMAGE_TYPE_CR2 = 2;
    private static final int IMAGE_TYPE_DNG = 3;
    private static final int IMAGE_TYPE_HEIF = 12;
    private static final int IMAGE_TYPE_JPEG = 4;
    private static final int IMAGE_TYPE_NEF = 5;
    private static final int IMAGE_TYPE_NRW = 6;
    private static final int IMAGE_TYPE_ORF = 7;
    private static final int IMAGE_TYPE_PEF = 8;
    private static final int IMAGE_TYPE_PNG = 13;
    private static final int IMAGE_TYPE_RAF = 9;
    private static final int IMAGE_TYPE_RW2 = 10;
    private static final int IMAGE_TYPE_SRW = 11;
    private static final int IMAGE_TYPE_UNKNOWN = 0;
    private static final int IMAGE_TYPE_WEBP = 14;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag JPEG_INTERCHANGE_FORMAT_LENGTH_TAG = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag JPEG_INTERCHANGE_FORMAT_TAG = null;
    public static final byte[] JPEG_SIGNATURE = null;
    public static final java.lang.String LATITUDE_NORTH = "N";
    public static final java.lang.String LATITUDE_SOUTH = "S";
    public static final short LIGHT_SOURCE_CLOUDY_WEATHER = 10;
    public static final short LIGHT_SOURCE_COOL_WHITE_FLUORESCENT = 14;
    public static final short LIGHT_SOURCE_D50 = 23;
    public static final short LIGHT_SOURCE_D55 = 20;
    public static final short LIGHT_SOURCE_D65 = 21;
    public static final short LIGHT_SOURCE_D75 = 22;
    public static final short LIGHT_SOURCE_DAYLIGHT = 1;
    public static final short LIGHT_SOURCE_DAYLIGHT_FLUORESCENT = 12;
    public static final short LIGHT_SOURCE_DAY_WHITE_FLUORESCENT = 13;
    public static final short LIGHT_SOURCE_FINE_WEATHER = 9;
    public static final short LIGHT_SOURCE_FLASH = 4;
    public static final short LIGHT_SOURCE_FLUORESCENT = 2;
    public static final short LIGHT_SOURCE_ISO_STUDIO_TUNGSTEN = 24;
    public static final short LIGHT_SOURCE_OTHER = 255;
    public static final short LIGHT_SOURCE_SHADE = 11;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_A = 17;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_B = 18;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_C = 19;
    public static final short LIGHT_SOURCE_TUNGSTEN = 3;
    public static final short LIGHT_SOURCE_UNKNOWN = 0;
    public static final short LIGHT_SOURCE_WARM_WHITE_FLUORESCENT = 16;
    public static final short LIGHT_SOURCE_WHITE_FLUORESCENT = 15;
    public static final java.lang.String LONGITUDE_EAST = "E";
    public static final java.lang.String LONGITUDE_WEST = "W";
    private static final byte MARKER_COM = -2;
    private static final byte MARKER_SOF0 = -64;
    private static final byte MARKER_SOF1 = -63;
    private static final byte MARKER_SOF10 = -54;
    private static final byte MARKER_SOF11 = -53;
    private static final byte MARKER_SOF13 = -51;
    private static final byte MARKER_SOF14 = -50;
    private static final byte MARKER_SOF15 = -49;
    private static final byte MARKER_SOF2 = -62;
    private static final byte MARKER_SOF3 = -61;
    private static final byte MARKER_SOF5 = -59;
    private static final byte MARKER_SOF6 = -58;
    private static final byte MARKER_SOF7 = -57;
    private static final byte MARKER_SOF9 = -55;
    private static final byte MARKER_SOI = -40;
    private static final byte MARKER_SOS = -38;
    private static final int MAX_THUMBNAIL_SIZE = 512;
    public static final short METERING_MODE_AVERAGE = 1;
    public static final short METERING_MODE_CENTER_WEIGHT_AVERAGE = 2;
    public static final short METERING_MODE_MULTI_SPOT = 4;
    public static final short METERING_MODE_OTHER = 255;
    public static final short METERING_MODE_PARTIAL = 6;
    public static final short METERING_MODE_PATTERN = 5;
    public static final short METERING_MODE_SPOT = 3;
    public static final short METERING_MODE_UNKNOWN = 0;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] ORF_CAMERA_SETTINGS_TAGS = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] ORF_IMAGE_PROCESSING_TAGS = null;
    private static final byte[] ORF_MAKER_NOTE_HEADER_1 = null;
    private static final int ORF_MAKER_NOTE_HEADER_1_SIZE = 8;
    private static final byte[] ORF_MAKER_NOTE_HEADER_2 = null;
    private static final int ORF_MAKER_NOTE_HEADER_2_SIZE = 12;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] ORF_MAKER_NOTE_TAGS = null;
    private static final short ORF_SIGNATURE_1 = 20306;
    private static final short ORF_SIGNATURE_2 = 21330;
    public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
    public static final int ORIENTATION_FLIP_VERTICAL = 4;
    public static final int ORIENTATION_NORMAL = 1;
    public static final int ORIENTATION_ROTATE_180 = 3;
    public static final int ORIENTATION_ROTATE_270 = 8;
    public static final int ORIENTATION_ROTATE_90 = 6;
    public static final int ORIENTATION_TRANSPOSE = 5;
    public static final int ORIENTATION_TRANSVERSE = 7;
    public static final int ORIENTATION_UNDEFINED = 0;
    public static final int ORIGINAL_RESOLUTION_IMAGE = 0;
    private static final int PEF_MAKER_NOTE_SKIP_SIZE = 6;
    private static final java.lang.String PEF_SIGNATURE = "PENTAX";
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] PEF_TAGS = null;
    public static final int PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO = 1;
    public static final int PHOTOMETRIC_INTERPRETATION_RGB = 2;
    public static final int PHOTOMETRIC_INTERPRETATION_WHITE_IS_ZERO = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_YCBCR = 6;
    private static final int PNG_CHUNK_CRC_BYTE_LENGTH = 4;
    private static final int PNG_CHUNK_TYPE_BYTE_LENGTH = 4;
    private static final byte[] PNG_CHUNK_TYPE_EXIF = null;
    private static final byte[] PNG_CHUNK_TYPE_IEND = null;
    private static final byte[] PNG_CHUNK_TYPE_IHDR = null;
    private static final byte[] PNG_SIGNATURE = null;
    private static final int RAF_JPEG_LENGTH_VALUE_SIZE = 4;
    private static final int RAF_OFFSET_TO_JPEG_IMAGE_OFFSET = 84;
    private static final java.lang.String RAF_SIGNATURE = "FUJIFILMCCD-RAW";
    public static final int REDUCED_RESOLUTION_IMAGE = 1;
    public static final short RENDERED_PROCESS_CUSTOM = 1;
    public static final short RENDERED_PROCESS_NORMAL = 0;
    public static final short RESOLUTION_UNIT_CENTIMETERS = 3;
    public static final short RESOLUTION_UNIT_INCHES = 2;
    private static final java.util.List<java.lang.Integer> ROTATION_ORDER = null;
    private static final short RW2_SIGNATURE = 85;
    public static final short SATURATION_HIGH = 0;
    public static final short SATURATION_LOW = 0;
    public static final short SATURATION_NORMAL = 0;
    public static final short SCENE_CAPTURE_TYPE_LANDSCAPE = 1;
    public static final short SCENE_CAPTURE_TYPE_NIGHT = 3;
    public static final short SCENE_CAPTURE_TYPE_PORTRAIT = 2;
    public static final short SCENE_CAPTURE_TYPE_STANDARD = 0;
    public static final short SCENE_TYPE_DIRECTLY_PHOTOGRAPHED = 1;
    public static final short SENSITIVITY_TYPE_ISO_SPEED = 3;
    public static final short SENSITIVITY_TYPE_REI = 2;
    public static final short SENSITIVITY_TYPE_REI_AND_ISO = 6;
    public static final short SENSITIVITY_TYPE_SOS = 1;
    public static final short SENSITIVITY_TYPE_SOS_AND_ISO = 5;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI = 4;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI_AND_ISO = 7;
    public static final short SENSITIVITY_TYPE_UNKNOWN = 0;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL = 5;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL_LINEAR = 8;
    public static final short SENSOR_TYPE_NOT_DEFINED = 1;
    public static final short SENSOR_TYPE_ONE_CHIP = 2;
    public static final short SENSOR_TYPE_THREE_CHIP = 4;
    public static final short SENSOR_TYPE_TRILINEAR = 7;
    public static final short SENSOR_TYPE_TWO_CHIP = 3;
    public static final short SHARPNESS_HARD = 2;
    public static final short SHARPNESS_NORMAL = 0;
    public static final short SHARPNESS_SOFT = 1;
    private static final int SIGNATURE_CHECK_SIZE = 5000;
    public static final int STREAM_TYPE_EXIF_DATA_ONLY = 1;
    public static final int STREAM_TYPE_FULL_IMAGE_DATA = 0;
    public static final short SUBJECT_DISTANCE_RANGE_CLOSE_VIEW = 2;
    public static final short SUBJECT_DISTANCE_RANGE_DISTANT_VIEW = 3;
    public static final short SUBJECT_DISTANCE_RANGE_MACRO = 1;
    public static final short SUBJECT_DISTANCE_RANGE_UNKNOWN = 0;
    private static final java.lang.String TAG = "ExifInterface";
    public static final java.lang.String TAG_APERTURE_VALUE = "ApertureValue";
    public static final java.lang.String TAG_ARTIST = "Artist";
    public static final java.lang.String TAG_BITS_PER_SAMPLE = "BitsPerSample";
    public static final java.lang.String TAG_BODY_SERIAL_NUMBER = "BodySerialNumber";
    public static final java.lang.String TAG_BRIGHTNESS_VALUE = "BrightnessValue";

    @java.lang.Deprecated
    public static final java.lang.String TAG_CAMARA_OWNER_NAME = "CameraOwnerName";
    public static final java.lang.String TAG_CAMERA_OWNER_NAME = "CameraOwnerName";
    public static final java.lang.String TAG_CFA_PATTERN = "CFAPattern";
    public static final java.lang.String TAG_COLOR_SPACE = "ColorSpace";
    public static final java.lang.String TAG_COMPONENTS_CONFIGURATION = "ComponentsConfiguration";
    public static final java.lang.String TAG_COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel";
    public static final java.lang.String TAG_COMPRESSION = "Compression";
    public static final java.lang.String TAG_CONTRAST = "Contrast";
    public static final java.lang.String TAG_COPYRIGHT = "Copyright";
    public static final java.lang.String TAG_CUSTOM_RENDERED = "CustomRendered";
    public static final java.lang.String TAG_DATETIME = "DateTime";
    public static final java.lang.String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
    public static final java.lang.String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
    public static final java.lang.String TAG_DEFAULT_CROP_SIZE = "DefaultCropSize";
    public static final java.lang.String TAG_DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription";
    public static final java.lang.String TAG_DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";
    public static final java.lang.String TAG_DNG_VERSION = "DNGVersion";
    private static final java.lang.String TAG_EXIF_IFD_POINTER = "ExifIFDPointer";
    public static final java.lang.String TAG_EXIF_VERSION = "ExifVersion";
    public static final java.lang.String TAG_EXPOSURE_BIAS_VALUE = "ExposureBiasValue";
    public static final java.lang.String TAG_EXPOSURE_INDEX = "ExposureIndex";
    public static final java.lang.String TAG_EXPOSURE_MODE = "ExposureMode";
    public static final java.lang.String TAG_EXPOSURE_PROGRAM = "ExposureProgram";
    public static final java.lang.String TAG_EXPOSURE_TIME = "ExposureTime";
    public static final java.lang.String TAG_FILE_SOURCE = "FileSource";
    public static final java.lang.String TAG_FLASH = "Flash";
    public static final java.lang.String TAG_FLASHPIX_VERSION = "FlashpixVersion";
    public static final java.lang.String TAG_FLASH_ENERGY = "FlashEnergy";
    public static final java.lang.String TAG_FOCAL_LENGTH = "FocalLength";
    public static final java.lang.String TAG_FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm";
    public static final java.lang.String TAG_FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";
    public static final java.lang.String TAG_FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution";
    public static final java.lang.String TAG_FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution";
    public static final java.lang.String TAG_F_NUMBER = "FNumber";
    public static final java.lang.String TAG_GAIN_CONTROL = "GainControl";
    public static final java.lang.String TAG_GAMMA = "Gamma";
    public static final java.lang.String TAG_GPS_ALTITUDE = "GPSAltitude";
    public static final java.lang.String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";
    public static final java.lang.String TAG_GPS_AREA_INFORMATION = "GPSAreaInformation";
    public static final java.lang.String TAG_GPS_DATESTAMP = "GPSDateStamp";
    public static final java.lang.String TAG_GPS_DEST_BEARING = "GPSDestBearing";
    public static final java.lang.String TAG_GPS_DEST_BEARING_REF = "GPSDestBearingRef";
    public static final java.lang.String TAG_GPS_DEST_DISTANCE = "GPSDestDistance";
    public static final java.lang.String TAG_GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";
    public static final java.lang.String TAG_GPS_DEST_LATITUDE = "GPSDestLatitude";
    public static final java.lang.String TAG_GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef";
    public static final java.lang.String TAG_GPS_DEST_LONGITUDE = "GPSDestLongitude";
    public static final java.lang.String TAG_GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef";
    public static final java.lang.String TAG_GPS_DIFFERENTIAL = "GPSDifferential";
    public static final java.lang.String TAG_GPS_DOP = "GPSDOP";
    public static final java.lang.String TAG_GPS_H_POSITIONING_ERROR = "GPSHPositioningError";
    public static final java.lang.String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
    public static final java.lang.String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
    private static final java.lang.String TAG_GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer";
    public static final java.lang.String TAG_GPS_LATITUDE = "GPSLatitude";
    public static final java.lang.String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
    public static final java.lang.String TAG_GPS_LONGITUDE = "GPSLongitude";
    public static final java.lang.String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
    public static final java.lang.String TAG_GPS_MAP_DATUM = "GPSMapDatum";
    public static final java.lang.String TAG_GPS_MEASURE_MODE = "GPSMeasureMode";
    public static final java.lang.String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
    public static final java.lang.String TAG_GPS_SATELLITES = "GPSSatellites";
    public static final java.lang.String TAG_GPS_SPEED = "GPSSpeed";
    public static final java.lang.String TAG_GPS_SPEED_REF = "GPSSpeedRef";
    public static final java.lang.String TAG_GPS_STATUS = "GPSStatus";
    public static final java.lang.String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
    public static final java.lang.String TAG_GPS_TRACK = "GPSTrack";
    public static final java.lang.String TAG_GPS_TRACK_REF = "GPSTrackRef";
    public static final java.lang.String TAG_GPS_VERSION_ID = "GPSVersionID";
    public static final java.lang.String TAG_IMAGE_DESCRIPTION = "ImageDescription";
    public static final java.lang.String TAG_IMAGE_LENGTH = "ImageLength";
    public static final java.lang.String TAG_IMAGE_UNIQUE_ID = "ImageUniqueID";
    public static final java.lang.String TAG_IMAGE_WIDTH = "ImageWidth";
    private static final java.lang.String TAG_INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer";
    public static final java.lang.String TAG_INTEROPERABILITY_INDEX = "InteroperabilityIndex";
    public static final java.lang.String TAG_ISO_SPEED = "ISOSpeed";
    public static final java.lang.String TAG_ISO_SPEED_LATITUDE_YYY = "ISOSpeedLatitudeyyy";
    public static final java.lang.String TAG_ISO_SPEED_LATITUDE_ZZZ = "ISOSpeedLatitudezzz";

    @java.lang.Deprecated
    public static final java.lang.String TAG_ISO_SPEED_RATINGS = "ISOSpeedRatings";
    public static final java.lang.String TAG_JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat";
    public static final java.lang.String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength";
    public static final java.lang.String TAG_LENS_MAKE = "LensMake";
    public static final java.lang.String TAG_LENS_MODEL = "LensModel";
    public static final java.lang.String TAG_LENS_SERIAL_NUMBER = "LensSerialNumber";
    public static final java.lang.String TAG_LENS_SPECIFICATION = "LensSpecification";
    public static final java.lang.String TAG_LIGHT_SOURCE = "LightSource";
    public static final java.lang.String TAG_MAKE = "Make";
    public static final java.lang.String TAG_MAKER_NOTE = "MakerNote";
    public static final java.lang.String TAG_MAX_APERTURE_VALUE = "MaxApertureValue";
    public static final java.lang.String TAG_METERING_MODE = "MeteringMode";
    public static final java.lang.String TAG_MODEL = "Model";
    public static final java.lang.String TAG_NEW_SUBFILE_TYPE = "NewSubfileType";
    public static final java.lang.String TAG_OECF = "OECF";
    public static final java.lang.String TAG_OFFSET_TIME = "OffsetTime";
    public static final java.lang.String TAG_OFFSET_TIME_DIGITIZED = "OffsetTimeDigitized";
    public static final java.lang.String TAG_OFFSET_TIME_ORIGINAL = "OffsetTimeOriginal";
    public static final java.lang.String TAG_ORF_ASPECT_FRAME = "AspectFrame";
    private static final java.lang.String TAG_ORF_CAMERA_SETTINGS_IFD_POINTER = "CameraSettingsIFDPointer";
    private static final java.lang.String TAG_ORF_IMAGE_PROCESSING_IFD_POINTER = "ImageProcessingIFDPointer";
    public static final java.lang.String TAG_ORF_PREVIEW_IMAGE_LENGTH = "PreviewImageLength";
    public static final java.lang.String TAG_ORF_PREVIEW_IMAGE_START = "PreviewImageStart";
    public static final java.lang.String TAG_ORF_THUMBNAIL_IMAGE = "ThumbnailImage";
    public static final java.lang.String TAG_ORIENTATION = "Orientation";
    public static final java.lang.String TAG_PHOTOGRAPHIC_SENSITIVITY = "PhotographicSensitivity";
    public static final java.lang.String TAG_PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";
    public static final java.lang.String TAG_PIXEL_X_DIMENSION = "PixelXDimension";
    public static final java.lang.String TAG_PIXEL_Y_DIMENSION = "PixelYDimension";
    public static final java.lang.String TAG_PLANAR_CONFIGURATION = "PlanarConfiguration";
    public static final java.lang.String TAG_PRIMARY_CHROMATICITIES = "PrimaryChromaticities";
    private static final androidx.exifinterface.media.ExifInterface.ExifTag TAG_RAF_IMAGE_SIZE = null;
    public static final java.lang.String TAG_RECOMMENDED_EXPOSURE_INDEX = "RecommendedExposureIndex";
    public static final java.lang.String TAG_REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";
    public static final java.lang.String TAG_RELATED_SOUND_FILE = "RelatedSoundFile";
    public static final java.lang.String TAG_RESOLUTION_UNIT = "ResolutionUnit";
    public static final java.lang.String TAG_ROWS_PER_STRIP = "RowsPerStrip";
    public static final java.lang.String TAG_RW2_ISO = "ISO";
    public static final java.lang.String TAG_RW2_JPG_FROM_RAW = "JpgFromRaw";
    public static final java.lang.String TAG_RW2_SENSOR_BOTTOM_BORDER = "SensorBottomBorder";
    public static final java.lang.String TAG_RW2_SENSOR_LEFT_BORDER = "SensorLeftBorder";
    public static final java.lang.String TAG_RW2_SENSOR_RIGHT_BORDER = "SensorRightBorder";
    public static final java.lang.String TAG_RW2_SENSOR_TOP_BORDER = "SensorTopBorder";
    public static final java.lang.String TAG_SAMPLES_PER_PIXEL = "SamplesPerPixel";
    public static final java.lang.String TAG_SATURATION = "Saturation";
    public static final java.lang.String TAG_SCENE_CAPTURE_TYPE = "SceneCaptureType";
    public static final java.lang.String TAG_SCENE_TYPE = "SceneType";
    public static final java.lang.String TAG_SENSING_METHOD = "SensingMethod";
    public static final java.lang.String TAG_SENSITIVITY_TYPE = "SensitivityType";
    public static final java.lang.String TAG_SHARPNESS = "Sharpness";
    public static final java.lang.String TAG_SHUTTER_SPEED_VALUE = "ShutterSpeedValue";
    public static final java.lang.String TAG_SOFTWARE = "Software";
    public static final java.lang.String TAG_SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse";
    public static final java.lang.String TAG_SPECTRAL_SENSITIVITY = "SpectralSensitivity";
    public static final java.lang.String TAG_STANDARD_OUTPUT_SENSITIVITY = "StandardOutputSensitivity";
    public static final java.lang.String TAG_STRIP_BYTE_COUNTS = "StripByteCounts";
    public static final java.lang.String TAG_STRIP_OFFSETS = "StripOffsets";
    public static final java.lang.String TAG_SUBFILE_TYPE = "SubfileType";
    public static final java.lang.String TAG_SUBJECT_AREA = "SubjectArea";
    public static final java.lang.String TAG_SUBJECT_DISTANCE = "SubjectDistance";
    public static final java.lang.String TAG_SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";
    public static final java.lang.String TAG_SUBJECT_LOCATION = "SubjectLocation";
    public static final java.lang.String TAG_SUBSEC_TIME = "SubSecTime";
    public static final java.lang.String TAG_SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized";
    public static final java.lang.String TAG_SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal";
    private static final java.lang.String TAG_SUB_IFD_POINTER = "SubIFDPointer";
    public static final java.lang.String TAG_THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength";
    public static final java.lang.String TAG_THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String TAG_THUMBNAIL_ORIENTATION = "ThumbnailOrientation";
    public static final java.lang.String TAG_TRANSFER_FUNCTION = "TransferFunction";
    public static final java.lang.String TAG_USER_COMMENT = "UserComment";
    public static final java.lang.String TAG_WHITE_BALANCE = "WhiteBalance";
    public static final java.lang.String TAG_WHITE_POINT = "WhitePoint";
    public static final java.lang.String TAG_XMP = "Xmp";
    public static final java.lang.String TAG_X_RESOLUTION = "XResolution";
    public static final java.lang.String TAG_Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients";
    public static final java.lang.String TAG_Y_CB_CR_POSITIONING = "YCbCrPositioning";
    public static final java.lang.String TAG_Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling";
    public static final java.lang.String TAG_Y_RESOLUTION = "YResolution";
    private static final int WEBP_CHUNK_SIZE_BYTE_LENGTH = 4;
    private static final byte[] WEBP_CHUNK_TYPE_ANIM = null;
    private static final byte[] WEBP_CHUNK_TYPE_ANMF = null;
    private static final int WEBP_CHUNK_TYPE_BYTE_LENGTH = 4;
    private static final byte[] WEBP_CHUNK_TYPE_EXIF = null;
    private static final byte[] WEBP_CHUNK_TYPE_VP8 = null;
    private static final byte[] WEBP_CHUNK_TYPE_VP8L = null;
    private static final byte[] WEBP_CHUNK_TYPE_VP8X = null;
    private static final int WEBP_CHUNK_TYPE_VP8X_DEFAULT_LENGTH = 10;
    private static final byte[] WEBP_CHUNK_TYPE_XMP = null;
    private static final int WEBP_FILE_SIZE_BYTE_LENGTH = 4;
    private static final byte[] WEBP_SIGNATURE_1 = null;
    private static final byte[] WEBP_SIGNATURE_2 = null;
    private static final byte WEBP_VP8L_SIGNATURE = 47;
    private static final byte[] WEBP_VP8_SIGNATURE = null;

    @java.lang.Deprecated
    public static final int WHITEBALANCE_AUTO = 0;

    @java.lang.Deprecated
    public static final int WHITEBALANCE_MANUAL = 1;
    public static final short WHITE_BALANCE_AUTO = 0;
    public static final short WHITE_BALANCE_MANUAL = 1;
    public static final short Y_CB_CR_POSITIONING_CENTERED = 1;
    public static final short Y_CB_CR_POSITIONING_CO_SITED = 2;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> sExifPointerTagMap = null;
    private static final java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface.ExifTag>[] sExifTagMapsForReading = null;
    private static final java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifTag>[] sExifTagMapsForWriting = null;
    private static java.text.SimpleDateFormat sFormatter;
    private static final java.util.regex.Pattern sGpsTimestampPattern = null;
    private static final java.util.regex.Pattern sNonZeroTimePattern = null;
    private static final java.util.HashSet<java.lang.String> sTagSetForCompatibility = null;
    private boolean mAreThumbnailStripsConsecutive;
    private android.content.res.AssetManager.AssetInputStream mAssetInputStream;
    private final java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute>[] mAttributes;
    private java.util.Set<java.lang.Integer> mAttributesOffsets;
    private java.nio.ByteOrder mExifByteOrder;
    private int mExifOffset;
    private java.lang.String mFilename;
    private boolean mHasThumbnail;
    private boolean mHasThumbnailStrips;
    private boolean mIsExifDataOnly;
    private boolean mIsSupportedFile;
    private int mMimeType;
    private boolean mModified;
    private int mOrfMakerNoteOffset;
    private int mOrfThumbnailLength;
    private int mOrfThumbnailOffset;
    private int mRw2JpgFromRawOffset;
    private java.io.FileDescriptor mSeekableFileDescriptor;
    private byte[] mThumbnailBytes;
    private int mThumbnailCompression;
    private int mThumbnailLength;
    private int mThumbnailOffset;
    private boolean mXmpIsFromSeparateMarker;


    public static class ByteOrderedDataInputStream extends java.io.InputStream implements java.io.DataInput {
        private static final java.nio.ByteOrder BIG_ENDIAN = null;
        private static final java.nio.ByteOrder LITTLE_ENDIAN = null;
        private java.nio.ByteOrder mByteOrder;
        private java.io.DataInputStream mDataInputStream;
        public final int mLength;
        public int mPosition;

        static {
                java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
                androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.LITTLE_ENDIAN = r0
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.BIG_ENDIAN = r0
                return
        }

        public ByteOrderedDataInputStream(java.io.InputStream r2) throws java.io.IOException {
                r1 = this;
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                r1.<init>(r2, r0)
                return
        }

        public ByteOrderedDataInputStream(java.io.InputStream r2, java.nio.ByteOrder r3) throws java.io.IOException {
                r1 = this;
                r1.<init>()
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                r1.mByteOrder = r0
                java.io.DataInputStream r0 = new java.io.DataInputStream
                r0.<init>(r2)
                r1.mDataInputStream = r0
                int r2 = r0.available()
                r1.mLength = r2
                r0 = 0
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                r0.mark(r2)
                r1.mByteOrder = r3
                return
        }

        public ByteOrderedDataInputStream(byte[] r2) throws java.io.IOException {
                r1 = this;
                java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
                r0.<init>(r2)
                r1.<init>(r0)
                return
        }

        @Override // java.io.InputStream
        public int available() throws java.io.IOException {
                r1 = this;
                java.io.DataInputStream r0 = r1.mDataInputStream
                int r0 = r0.available()
                return r0
        }

        public int getLength() {
                r1 = this;
                int r0 = r1.mLength
                return r0
        }

        public int peek() {
                r1 = this;
                int r0 = r1.mPosition
                return r0
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 1
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                int r0 = r0.read()
                return r0
        }

        @Override // java.io.InputStream
        public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.io.DataInputStream r0 = r1.mDataInputStream
                int r2 = r0.read(r2, r3, r4)
                int r3 = r1.mPosition
                int r3 = r3 + r2
                r1.mPosition = r3
                return r2
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 1
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                boolean r0 = r0.readBoolean()
                return r0
        }

        @Override // java.io.DataInput
        public byte readByte() throws java.io.IOException {
                r2 = this;
                int r0 = r2.mPosition
                int r0 = r0 + 1
                r2.mPosition = r0
                int r1 = r2.mLength
                if (r0 > r1) goto L1a
                java.io.DataInputStream r0 = r2.mDataInputStream
                int r0 = r0.read()
                if (r0 < 0) goto L14
                byte r0 = (byte) r0
                return r0
            L14:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
            L1a:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        @Override // java.io.DataInput
        public char readChar() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 2
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                char r0 = r0.readChar()
                return r0
        }

        @Override // java.io.DataInput
        public double readDouble() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readLong()
                double r0 = java.lang.Double.longBitsToDouble(r0)
                return r0
        }

        @Override // java.io.DataInput
        public float readFloat() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readInt()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                return r0
        }

        @Override // java.io.DataInput
        public void readFully(byte[] r4) throws java.io.IOException {
                r3 = this;
                int r0 = r3.mPosition
                int r1 = r4.length
                int r0 = r0 + r1
                r3.mPosition = r0
                int r1 = r3.mLength
                if (r0 > r1) goto L1e
                java.io.DataInputStream r0 = r3.mDataInputStream
                r1 = 0
                int r2 = r4.length
                int r0 = r0.read(r4, r1, r2)
                int r4 = r4.length
                if (r0 != r4) goto L16
                return
            L16:
                java.io.IOException r4 = new java.io.IOException
                java.lang.String r0 = "Couldn't read up to the length of buffer"
                r4.<init>(r0)
                throw r4
            L1e:
                java.io.EOFException r4 = new java.io.EOFException
                r4.<init>()
                throw r4
        }

        @Override // java.io.DataInput
        public void readFully(byte[] r3, int r4, int r5) throws java.io.IOException {
                r2 = this;
                int r0 = r2.mPosition
                int r0 = r0 + r5
                r2.mPosition = r0
                int r1 = r2.mLength
                if (r0 > r1) goto L1a
                java.io.DataInputStream r0 = r2.mDataInputStream
                int r3 = r0.read(r3, r4, r5)
                if (r3 != r5) goto L12
                return
            L12:
                java.io.IOException r3 = new java.io.IOException
                java.lang.String r4 = "Couldn't read up to the length of buffer"
                r3.<init>(r4)
                throw r3
            L1a:
                java.io.EOFException r3 = new java.io.EOFException
                r3.<init>()
                throw r3
        }

        @Override // java.io.DataInput
        public int readInt() throws java.io.IOException {
                r6 = this;
                int r0 = r6.mPosition
                int r0 = r0 + 4
                r6.mPosition = r0
                int r1 = r6.mLength
                if (r0 > r1) goto L61
                java.io.DataInputStream r0 = r6.mDataInputStream
                int r0 = r0.read()
                java.io.DataInputStream r1 = r6.mDataInputStream
                int r1 = r1.read()
                java.io.DataInputStream r2 = r6.mDataInputStream
                int r2 = r2.read()
                java.io.DataInputStream r3 = r6.mDataInputStream
                int r3 = r3.read()
                r4 = r0 | r1
                r4 = r4 | r2
                r4 = r4 | r3
                if (r4 < 0) goto L5b
                java.nio.ByteOrder r4 = r6.mByteOrder
                java.nio.ByteOrder r5 = androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.LITTLE_ENDIAN
                if (r4 != r5) goto L38
                int r3 = r3 << 24
                int r2 = r2 << 16
                int r3 = r3 + r2
                int r1 = r1 << 8
                int r3 = r3 + r1
                int r3 = r3 + r0
                return r3
            L38:
                java.nio.ByteOrder r5 = androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.BIG_ENDIAN
                if (r4 != r5) goto L46
                int r0 = r0 << 24
                int r1 = r1 << 16
                int r0 = r0 + r1
                int r1 = r2 << 8
                int r0 = r0 + r1
                int r0 = r0 + r3
                return r0
            L46:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Invalid byte order: "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                java.nio.ByteOrder r2 = r6.mByteOrder
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L5b:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
            L61:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        @Override // java.io.DataInput
        public java.lang.String readLine() throws java.io.IOException {
                r2 = this;
                java.lang.String r0 = "ExifInterface"
                java.lang.String r1 = "Currently unsupported"
                android.util.Log.d(r0, r1)
                r0 = 0
                return r0
        }

        @Override // java.io.DataInput
        public long readLong() throws java.io.IOException {
                r17 = this;
                r0 = r17
                int r1 = r0.mPosition
                int r1 = r1 + 8
                r0.mPosition = r1
                int r2 = r0.mLength
                if (r1 > r2) goto Laf
                java.io.DataInputStream r1 = r0.mDataInputStream
                int r1 = r1.read()
                java.io.DataInputStream r2 = r0.mDataInputStream
                int r2 = r2.read()
                java.io.DataInputStream r3 = r0.mDataInputStream
                int r3 = r3.read()
                java.io.DataInputStream r4 = r0.mDataInputStream
                int r4 = r4.read()
                java.io.DataInputStream r5 = r0.mDataInputStream
                int r5 = r5.read()
                java.io.DataInputStream r6 = r0.mDataInputStream
                int r6 = r6.read()
                java.io.DataInputStream r7 = r0.mDataInputStream
                int r7 = r7.read()
                java.io.DataInputStream r8 = r0.mDataInputStream
                int r8 = r8.read()
                r9 = r1 | r2
                r9 = r9 | r3
                r9 = r9 | r4
                r9 = r9 | r5
                r9 = r9 | r6
                r9 = r9 | r7
                r9 = r9 | r8
                if (r9 < 0) goto La9
                java.nio.ByteOrder r9 = r0.mByteOrder
                java.nio.ByteOrder r10 = androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.LITTLE_ENDIAN
                r13 = 32
                r14 = 40
                r15 = 48
                r16 = 56
                if (r9 != r10) goto L72
                long r8 = (long) r8
                long r8 = r8 << r16
                long r11 = (long) r7
                long r11 = r11 << r15
                long r8 = r8 + r11
                long r6 = (long) r6
                long r6 = r6 << r14
                long r8 = r8 + r6
                long r5 = (long) r5
                long r5 = r5 << r13
                long r8 = r8 + r5
                long r4 = (long) r4
                r6 = 24
                long r4 = r4 << r6
                long r8 = r8 + r4
                long r3 = (long) r3
                r5 = 16
                long r3 = r3 << r5
                long r8 = r8 + r3
                long r2 = (long) r2
                r4 = 8
                long r2 = r2 << r4
                long r8 = r8 + r2
                long r1 = (long) r1
                long r8 = r8 + r1
                return r8
            L72:
                java.nio.ByteOrder r10 = androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.BIG_ENDIAN
                if (r9 != r10) goto L94
                long r9 = (long) r1
                long r9 = r9 << r16
                long r1 = (long) r2
                long r1 = r1 << r15
                long r9 = r9 + r1
                long r1 = (long) r3
                long r1 = r1 << r14
                long r9 = r9 + r1
                long r1 = (long) r4
                long r1 = r1 << r13
                long r9 = r9 + r1
                long r1 = (long) r5
                r3 = 24
                long r1 = r1 << r3
                long r9 = r9 + r1
                long r1 = (long) r6
                r3 = 16
                long r1 = r1 << r3
                long r9 = r9 + r1
                long r1 = (long) r7
                r3 = 8
                long r1 = r1 << r3
                long r9 = r9 + r1
                long r1 = (long) r8
                long r9 = r9 + r1
                return r9
            L94:
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = "Invalid byte order: "
                java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
                java.nio.ByteOrder r3 = r0.mByteOrder
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            La9:
                java.io.EOFException r1 = new java.io.EOFException
                r1.<init>()
                throw r1
            Laf:
                java.io.EOFException r1 = new java.io.EOFException
                r1.<init>()
                throw r1
        }

        @Override // java.io.DataInput
        public short readShort() throws java.io.IOException {
                r4 = this;
                int r0 = r4.mPosition
                int r0 = r0 + 2
                r4.mPosition = r0
                int r1 = r4.mLength
                if (r0 > r1) goto L49
                java.io.DataInputStream r0 = r4.mDataInputStream
                int r0 = r0.read()
                java.io.DataInputStream r1 = r4.mDataInputStream
                int r1 = r1.read()
                r2 = r0 | r1
                if (r2 < 0) goto L43
                java.nio.ByteOrder r2 = r4.mByteOrder
                java.nio.ByteOrder r3 = androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.LITTLE_ENDIAN
                if (r2 != r3) goto L25
                int r1 = r1 << 8
                int r1 = r1 + r0
                short r0 = (short) r1
                return r0
            L25:
                java.nio.ByteOrder r3 = androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.BIG_ENDIAN
                if (r2 != r3) goto L2e
                int r0 = r0 << 8
                int r0 = r0 + r1
                short r0 = (short) r0
                return r0
            L2e:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Invalid byte order: "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                java.nio.ByteOrder r2 = r4.mByteOrder
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L43:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
            L49:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        @Override // java.io.DataInput
        public java.lang.String readUTF() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 2
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                java.lang.String r0 = r0.readUTF()
                return r0
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 1
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                int r0 = r0.readUnsignedByte()
                return r0
        }

        public long readUnsignedInt() throws java.io.IOException {
                r4 = this;
                int r0 = r4.readInt()
                long r0 = (long) r0
                r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r0 = r0 & r2
                return r0
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws java.io.IOException {
                r4 = this;
                int r0 = r4.mPosition
                int r0 = r0 + 2
                r4.mPosition = r0
                int r1 = r4.mLength
                if (r0 > r1) goto L47
                java.io.DataInputStream r0 = r4.mDataInputStream
                int r0 = r0.read()
                java.io.DataInputStream r1 = r4.mDataInputStream
                int r1 = r1.read()
                r2 = r0 | r1
                if (r2 < 0) goto L41
                java.nio.ByteOrder r2 = r4.mByteOrder
                java.nio.ByteOrder r3 = androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.LITTLE_ENDIAN
                if (r2 != r3) goto L24
                int r1 = r1 << 8
                int r1 = r1 + r0
                return r1
            L24:
                java.nio.ByteOrder r3 = androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.BIG_ENDIAN
                if (r2 != r3) goto L2c
                int r0 = r0 << 8
                int r0 = r0 + r1
                return r0
            L2c:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Invalid byte order: "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                java.nio.ByteOrder r2 = r4.mByteOrder
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L41:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
            L47:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        public void seek(long r5) throws java.io.IOException {
                r4 = this;
                int r0 = r4.mPosition
                long r1 = (long) r0
                int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r3 <= 0) goto L17
                r0 = 0
                r4.mPosition = r0
                java.io.DataInputStream r0 = r4.mDataInputStream
                r0.reset()
                java.io.DataInputStream r0 = r4.mDataInputStream
                int r1 = r4.mLength
                r0.mark(r1)
                goto L19
            L17:
                long r0 = (long) r0
                long r5 = r5 - r0
            L19:
                int r6 = (int) r5
                int r5 = r4.skipBytes(r6)
                if (r5 != r6) goto L21
                return
            L21:
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r6 = "Couldn't seek up to the byteCount"
                r5.<init>(r6)
                throw r5
        }

        public void setByteOrder(java.nio.ByteOrder r1) {
                r0 = this;
                r0.mByteOrder = r1
                return
        }

        @Override // java.io.DataInput
        public int skipBytes(int r4) throws java.io.IOException {
                r3 = this;
                int r0 = r3.mLength
                int r1 = r3.mPosition
                int r0 = r0 - r1
                int r4 = java.lang.Math.min(r4, r0)
                r0 = 0
            La:
                if (r0 >= r4) goto L16
                java.io.DataInputStream r1 = r3.mDataInputStream
                int r2 = r4 - r0
                int r1 = r1.skipBytes(r2)
                int r0 = r0 + r1
                goto La
            L16:
                int r4 = r3.mPosition
                int r4 = r4 + r0
                r3.mPosition = r4
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class ByteOrderedDataOutputStream extends java.io.FilterOutputStream {
        private java.nio.ByteOrder mByteOrder;
        public final java.io.OutputStream mOutputStream;

        public ByteOrderedDataOutputStream(java.io.OutputStream r1, java.nio.ByteOrder r2) {
                r0 = this;
                r0.<init>(r1)
                r0.mOutputStream = r1
                r0.mByteOrder = r2
                return
        }

        public void setByteOrder(java.nio.ByteOrder r1) {
                r0 = this;
                r0.mByteOrder = r1
                return
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] r2) throws java.io.IOException {
                r1 = this;
                java.io.OutputStream r0 = r1.mOutputStream
                r0.write(r2)
                return
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.io.OutputStream r0 = r1.mOutputStream
                r0.write(r2, r3, r4)
                return
        }

        public void writeByte(int r2) throws java.io.IOException {
                r1 = this;
                java.io.OutputStream r0 = r1.mOutputStream
                r0.write(r2)
                return
        }

        public void writeInt(int r3) throws java.io.IOException {
                r2 = this;
                java.nio.ByteOrder r0 = r2.mByteOrder
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                if (r0 != r1) goto L2b
                java.io.OutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 0
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.OutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 8
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.OutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 16
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.OutputStream r0 = r2.mOutputStream
                int r3 = r3 >>> 24
                r3 = r3 & 255(0xff, float:3.57E-43)
                r0.write(r3)
                goto L53
            L2b:
                java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
                if (r0 != r1) goto L53
                java.io.OutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 24
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.OutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 16
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.OutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 8
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.OutputStream r0 = r2.mOutputStream
                int r3 = r3 >>> 0
                r3 = r3 & 255(0xff, float:3.57E-43)
                r0.write(r3)
            L53:
                return
        }

        public void writeShort(short r3) throws java.io.IOException {
                r2 = this;
                java.nio.ByteOrder r0 = r2.mByteOrder
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                if (r0 != r1) goto L19
                java.io.OutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 0
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.OutputStream r0 = r2.mOutputStream
                int r3 = r3 >>> 8
                r3 = r3 & 255(0xff, float:3.57E-43)
                r0.write(r3)
                goto L2f
            L19:
                java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
                if (r0 != r1) goto L2f
                java.io.OutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 8
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.OutputStream r0 = r2.mOutputStream
                int r3 = r3 >>> 0
                r3 = r3 & 255(0xff, float:3.57E-43)
                r0.write(r3)
            L2f:
                return
        }

        public void writeUnsignedInt(long r1) throws java.io.IOException {
                r0 = this;
                int r2 = (int) r1
                r0.writeInt(r2)
                return
        }

        public void writeUnsignedShort(int r1) throws java.io.IOException {
                r0 = this;
                short r1 = (short) r1
                r0.writeShort(r1)
                return
        }
    }

    public static class ExifAttribute {
        public static final long BYTES_OFFSET_UNKNOWN = -1;
        public final byte[] bytes;
        public final long bytesOffset;
        public final int format;
        public final int numberOfComponents;

        public ExifAttribute(int r1, int r2, long r3, byte[] r5) {
                r0 = this;
                r0.<init>()
                r0.format = r1
                r0.numberOfComponents = r2
                r0.bytesOffset = r3
                r0.bytes = r5
                return
        }

        public ExifAttribute(int r7, int r8, byte[] r9) {
                r6 = this;
                r3 = -1
                r0 = r6
                r1 = r7
                r2 = r8
                r5 = r9
                r0.<init>(r1, r2, r3, r5)
                return
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createByte(java.lang.String r5) {
                int r0 = r5.length()
                r1 = 1
                if (r0 != r1) goto L28
                r0 = 0
                char r2 = r5.charAt(r0)
                r3 = 48
                if (r2 < r3) goto L28
                char r2 = r5.charAt(r0)
                r4 = 49
                if (r2 > r4) goto L28
                byte[] r2 = new byte[r1]
                char r5 = r5.charAt(r0)
                int r5 = r5 - r3
                byte r5 = (byte) r5
                r2[r0] = r5
                androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                r5.<init>(r1, r1, r2)
                return r5
            L28:
                java.nio.charset.Charset r0 = androidx.exifinterface.media.ExifInterface.ASCII
                byte[] r5 = r5.getBytes(r0)
                androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r2 = r5.length
                r0.<init>(r1, r2, r5)
                return r0
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createDouble(double r2, java.nio.ByteOrder r4) {
                r0 = 1
                double[] r0 = new double[r0]
                r1 = 0
                r0[r1] = r2
                androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = createDouble(r0, r4)
                return r2
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createDouble(double[] r5, java.nio.ByteOrder r6) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
                r1 = 12
                r0 = r0[r1]
                int r2 = r5.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r6)
                int r6 = r5.length
                r2 = 0
            L14:
                if (r2 >= r6) goto L1e
                r3 = r5[r2]
                r0.putDouble(r3)
                int r2 = r2 + 1
                goto L14
            L1e:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r5 = r5.length
                byte[] r0 = r0.array()
                r6.<init>(r1, r5, r0)
                return r6
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createSLong(int r2, java.nio.ByteOrder r3) {
                r0 = 1
                int[] r0 = new int[r0]
                r1 = 0
                r0[r1] = r2
                androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = createSLong(r0, r3)
                return r2
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createSLong(int[] r4, java.nio.ByteOrder r5) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
                r1 = 9
                r0 = r0[r1]
                int r2 = r4.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r5)
                int r5 = r4.length
                r2 = 0
            L14:
                if (r2 >= r5) goto L1e
                r3 = r4[r2]
                r0.putInt(r3)
                int r2 = r2 + 1
                goto L14
            L1e:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r4 = r4.length
                byte[] r0 = r0.array()
                r5.<init>(r1, r4, r0)
                return r5
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createSRational(androidx.exifinterface.media.ExifInterface.Rational r2, java.nio.ByteOrder r3) {
                r0 = 1
                androidx.exifinterface.media.ExifInterface$Rational[] r0 = new androidx.exifinterface.media.ExifInterface.Rational[r0]
                r1 = 0
                r0[r1] = r2
                androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = createSRational(r0, r3)
                return r2
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createSRational(androidx.exifinterface.media.ExifInterface.Rational[] r6, java.nio.ByteOrder r7) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
                r1 = 10
                r0 = r0[r1]
                int r2 = r6.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r7)
                int r7 = r6.length
                r2 = 0
            L14:
                if (r2 >= r7) goto L27
                r3 = r6[r2]
                long r4 = r3.numerator
                int r5 = (int) r4
                r0.putInt(r5)
                long r3 = r3.denominator
                int r4 = (int) r3
                r0.putInt(r4)
                int r2 = r2 + 1
                goto L14
            L27:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r6 = r6.length
                byte[] r0 = r0.array()
                r7.<init>(r1, r6, r0)
                return r7
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createString(java.lang.String r3) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                r3 = 0
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.nio.charset.Charset r0 = androidx.exifinterface.media.ExifInterface.ASCII
                byte[] r3 = r3.getBytes(r0)
                androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r1 = r3.length
                r2 = 2
                r0.<init>(r2, r1, r3)
                return r0
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createULong(long r2, java.nio.ByteOrder r4) {
                r0 = 1
                long[] r0 = new long[r0]
                r1 = 0
                r0[r1] = r2
                androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = createULong(r0, r4)
                return r2
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createULong(long[] r5, java.nio.ByteOrder r6) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
                r1 = 4
                r0 = r0[r1]
                int r2 = r5.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r6)
                int r6 = r5.length
                r2 = 0
            L13:
                if (r2 >= r6) goto L1e
                r3 = r5[r2]
                int r4 = (int) r3
                r0.putInt(r4)
                int r2 = r2 + 1
                goto L13
            L1e:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r5 = r5.length
                byte[] r0 = r0.array()
                r6.<init>(r1, r5, r0)
                return r6
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createURational(androidx.exifinterface.media.ExifInterface.Rational r2, java.nio.ByteOrder r3) {
                r0 = 1
                androidx.exifinterface.media.ExifInterface$Rational[] r0 = new androidx.exifinterface.media.ExifInterface.Rational[r0]
                r1 = 0
                r0[r1] = r2
                androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = createURational(r0, r3)
                return r2
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createURational(androidx.exifinterface.media.ExifInterface.Rational[] r6, java.nio.ByteOrder r7) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
                r1 = 5
                r0 = r0[r1]
                int r2 = r6.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r7)
                int r7 = r6.length
                r2 = 0
            L13:
                if (r2 >= r7) goto L26
                r3 = r6[r2]
                long r4 = r3.numerator
                int r5 = (int) r4
                r0.putInt(r5)
                long r3 = r3.denominator
                int r4 = (int) r3
                r0.putInt(r4)
                int r2 = r2 + 1
                goto L13
            L26:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r6 = r6.length
                byte[] r0 = r0.array()
                r7.<init>(r1, r6, r0)
                return r7
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createUShort(int r2, java.nio.ByteOrder r3) {
                r0 = 1
                int[] r0 = new int[r0]
                r1 = 0
                r0[r1] = r2
                androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = createUShort(r0, r3)
                return r2
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createUShort(int[] r4, java.nio.ByteOrder r5) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
                r1 = 3
                r0 = r0[r1]
                int r2 = r4.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r5)
                int r5 = r4.length
                r2 = 0
            L13:
                if (r2 >= r5) goto L1e
                r3 = r4[r2]
                short r3 = (short) r3
                r0.putShort(r3)
                int r2 = r2 + 1
                goto L13
            L1e:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r4 = r4.length
                byte[] r0 = r0.array()
                r5.<init>(r1, r4, r0)
                return r5
        }

        public double getDoubleValue(java.nio.ByteOrder r5) {
                r4 = this;
                java.lang.Object r5 = r4.getValue(r5)
                if (r5 == 0) goto L6b
                boolean r0 = r5 instanceof java.lang.String
                if (r0 == 0) goto L11
                java.lang.String r5 = (java.lang.String) r5
                double r0 = java.lang.Double.parseDouble(r5)
                return r0
            L11:
                boolean r0 = r5 instanceof long[]
                r1 = 0
                java.lang.String r2 = "There are more than one component"
                r3 = 1
                if (r0 == 0) goto L28
                long[] r5 = (long[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L22
                r0 = r5[r1]
                double r0 = (double) r0
                return r0
            L22:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r2)
                throw r5
            L28:
                boolean r0 = r5 instanceof int[]
                if (r0 == 0) goto L3b
                int[] r5 = (int[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L35
                r5 = r5[r1]
                double r0 = (double) r5
                return r0
            L35:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r2)
                throw r5
            L3b:
                boolean r0 = r5 instanceof double[]
                if (r0 == 0) goto L4d
                double[] r5 = (double[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L47
                r0 = r5[r1]
                return r0
            L47:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r2)
                throw r5
            L4d:
                boolean r0 = r5 instanceof androidx.exifinterface.media.ExifInterface.Rational[]
                if (r0 == 0) goto L63
                androidx.exifinterface.media.ExifInterface$Rational[] r5 = (androidx.exifinterface.media.ExifInterface.Rational[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L5d
                r5 = r5[r1]
                double r0 = r5.calculate()
                return r0
            L5d:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r2)
                throw r5
            L63:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "Couldn't find a double value"
                r5.<init>(r0)
                throw r5
            L6b:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "NULL can't be converted to a double value"
                r5.<init>(r0)
                throw r5
        }

        public int getIntValue(java.nio.ByteOrder r5) {
                r4 = this;
                java.lang.Object r5 = r4.getValue(r5)
                if (r5 == 0) goto L42
                boolean r0 = r5 instanceof java.lang.String
                if (r0 == 0) goto L11
                java.lang.String r5 = (java.lang.String) r5
                int r5 = java.lang.Integer.parseInt(r5)
                return r5
            L11:
                boolean r0 = r5 instanceof long[]
                r1 = 0
                java.lang.String r2 = "There are more than one component"
                r3 = 1
                if (r0 == 0) goto L28
                long[] r5 = (long[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L22
                r0 = r5[r1]
                int r5 = (int) r0
                return r5
            L22:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r2)
                throw r5
            L28:
                boolean r0 = r5 instanceof int[]
                if (r0 == 0) goto L3a
                int[] r5 = (int[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L34
                r5 = r5[r1]
                return r5
            L34:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r2)
                throw r5
            L3a:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "Couldn't find a integer value"
                r5.<init>(r0)
                throw r5
            L42:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "NULL can't be converted to a integer value"
                r5.<init>(r0)
                throw r5
        }

        public java.lang.String getStringValue(java.nio.ByteOrder r8) {
                r7 = this;
                java.lang.Object r8 = r7.getValue(r8)
                r0 = 0
                if (r8 != 0) goto L8
                return r0
            L8:
                boolean r1 = r8 instanceof java.lang.String
                if (r1 == 0) goto Lf
                java.lang.String r8 = (java.lang.String) r8
                return r8
            Lf:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                boolean r2 = r8 instanceof long[]
                java.lang.String r3 = ","
                r4 = 0
                if (r2 == 0) goto L33
                long[] r8 = (long[]) r8
            L1d:
                int r0 = r8.length
                if (r4 >= r0) goto L2e
                r5 = r8[r4]
                r1.append(r5)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L1d
                r1.append(r3)
                goto L1d
            L2e:
                java.lang.String r8 = r1.toString()
                return r8
            L33:
                boolean r2 = r8 instanceof int[]
                if (r2 == 0) goto L4f
                int[] r8 = (int[]) r8
            L39:
                int r0 = r8.length
                if (r4 >= r0) goto L4a
                r0 = r8[r4]
                r1.append(r0)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L39
                r1.append(r3)
                goto L39
            L4a:
                java.lang.String r8 = r1.toString()
                return r8
            L4f:
                boolean r2 = r8 instanceof double[]
                if (r2 == 0) goto L6b
                double[] r8 = (double[]) r8
            L55:
                int r0 = r8.length
                if (r4 >= r0) goto L66
                r5 = r8[r4]
                r1.append(r5)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L55
                r1.append(r3)
                goto L55
            L66:
                java.lang.String r8 = r1.toString()
                return r8
            L6b:
                boolean r2 = r8 instanceof androidx.exifinterface.media.ExifInterface.Rational[]
                if (r2 == 0) goto L95
                androidx.exifinterface.media.ExifInterface$Rational[] r8 = (androidx.exifinterface.media.ExifInterface.Rational[]) r8
            L71:
                int r0 = r8.length
                if (r4 >= r0) goto L90
                r0 = r8[r4]
                long r5 = r0.numerator
                r1.append(r5)
                r0 = 47
                r1.append(r0)
                r0 = r8[r4]
                long r5 = r0.denominator
                r1.append(r5)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L71
                r1.append(r3)
                goto L71
            L90:
                java.lang.String r8 = r1.toString()
                return r8
            L95:
                return r0
        }

        public final java.lang.Object getValue(java.nio.ByteOrder r11) {
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r3 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L187 java.io.IOException -> L189
                byte[] r4 = r10.bytes     // Catch: java.lang.Throwable -> L187 java.io.IOException -> L189
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L187 java.io.IOException -> L189
                r3.setByteOrder(r11)     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r11 = r10.format     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L148;
                    case 2: goto Lfd;
                    case 3: goto Le3;
                    case 4: goto Lc9;
                    case 5: goto La6;
                    case 6: goto L148;
                    case 7: goto Lfd;
                    case 8: goto L8c;
                    case 9: goto L72;
                    case 10: goto L4d;
                    case 11: goto L32;
                    case 12: goto L18;
                    default: goto L16;
                }     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            L16:
                goto L17c
            L18:
                int r11 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                double[] r11 = new double[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            L1c:
                int r4 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r5 >= r4) goto L29
                double r6 = r3.readDouble()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11[r5] = r6     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r5 = r5 + 1
                goto L1c
            L29:
                r3.close()     // Catch: java.io.IOException -> L2d
                goto L31
            L2d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L31:
                return r11
            L32:
                int r11 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                double[] r11 = new double[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            L36:
                int r4 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r5 >= r4) goto L44
                float r4 = r3.readFloat()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                double r6 = (double) r4     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11[r5] = r6     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r5 = r5 + 1
                goto L36
            L44:
                r3.close()     // Catch: java.io.IOException -> L48
                goto L4c
            L48:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L4c:
                return r11
            L4d:
                int r11 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                androidx.exifinterface.media.ExifInterface$Rational[] r11 = new androidx.exifinterface.media.ExifInterface.Rational[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            L51:
                int r4 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r5 >= r4) goto L69
                int r4 = r3.readInt()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                long r6 = (long) r4     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r4 = r3.readInt()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                long r8 = (long) r4     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                androidx.exifinterface.media.ExifInterface$Rational r4 = new androidx.exifinterface.media.ExifInterface$Rational     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r4.<init>(r6, r8)     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11[r5] = r4     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r5 = r5 + 1
                goto L51
            L69:
                r3.close()     // Catch: java.io.IOException -> L6d
                goto L71
            L6d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L71:
                return r11
            L72:
                int r11 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int[] r11 = new int[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            L76:
                int r4 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r5 >= r4) goto L83
                int r4 = r3.readInt()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11[r5] = r4     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r5 = r5 + 1
                goto L76
            L83:
                r3.close()     // Catch: java.io.IOException -> L87
                goto L8b
            L87:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L8b:
                return r11
            L8c:
                int r11 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int[] r11 = new int[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            L90:
                int r4 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r5 >= r4) goto L9d
                short r4 = r3.readShort()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11[r5] = r4     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r5 = r5 + 1
                goto L90
            L9d:
                r3.close()     // Catch: java.io.IOException -> La1
                goto La5
            La1:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            La5:
                return r11
            La6:
                int r11 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                androidx.exifinterface.media.ExifInterface$Rational[] r11 = new androidx.exifinterface.media.ExifInterface.Rational[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            Laa:
                int r4 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r5 >= r4) goto Lc0
                long r6 = r3.readUnsignedInt()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                long r8 = r3.readUnsignedInt()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                androidx.exifinterface.media.ExifInterface$Rational r4 = new androidx.exifinterface.media.ExifInterface$Rational     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r4.<init>(r6, r8)     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11[r5] = r4     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r5 = r5 + 1
                goto Laa
            Lc0:
                r3.close()     // Catch: java.io.IOException -> Lc4
                goto Lc8
            Lc4:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            Lc8:
                return r11
            Lc9:
                int r11 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                long[] r11 = new long[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            Lcd:
                int r4 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r5 >= r4) goto Lda
                long r6 = r3.readUnsignedInt()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11[r5] = r6     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r5 = r5 + 1
                goto Lcd
            Lda:
                r3.close()     // Catch: java.io.IOException -> Lde
                goto Le2
            Lde:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            Le2:
                return r11
            Le3:
                int r11 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int[] r11 = new int[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            Le7:
                int r4 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r5 >= r4) goto Lf4
                int r4 = r3.readUnsignedShort()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11[r5] = r4     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r5 = r5 + 1
                goto Le7
            Lf4:
                r3.close()     // Catch: java.io.IOException -> Lf8
                goto Lfc
            Lf8:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            Lfc:
                return r11
            Lfd:
                int r11 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                byte[] r6 = androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r6 = r6.length     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r11 < r6) goto L11a
                r11 = 0
            L105:
                byte[] r6 = androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r7 = r6.length     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r11 >= r7) goto L117
                byte[] r7 = r10.bytes     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r7 = r7[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r8 = r6[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r7 == r8) goto L114
                r4 = 0
                goto L117
            L114:
                int r11 = r11 + 1
                goto L105
            L117:
                if (r4 == 0) goto L11a
                int r5 = r6.length     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            L11a:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11.<init>()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            L11f:
                int r4 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r5 >= r4) goto L13b
                byte[] r4 = r10.bytes     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r4 = r4[r5]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r4 != 0) goto L12a
                goto L13b
            L12a:
                r6 = 32
                if (r4 < r6) goto L133
                char r4 = (char) r4     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11.append(r4)     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                goto L138
            L133:
                r4 = 63
                r11.append(r4)     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            L138:
                int r5 = r5 + 1
                goto L11f
            L13b:
                java.lang.String r11 = r11.toString()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r3.close()     // Catch: java.io.IOException -> L143
                goto L147
            L143:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L147:
                return r11
            L148:
                byte[] r11 = r10.bytes     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r6 = r11.length     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r6 != r4) goto L16c
                r6 = r11[r5]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r6 < 0) goto L16c
                r6 = r11[r5]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r6 > r4) goto L16c
                java.lang.String r6 = new java.lang.String     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                char[] r4 = new char[r4]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11 = r11[r5]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r11 = r11 + 48
                char r11 = (char) r11     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r4[r5] = r11     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r6.<init>(r4)     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r3.close()     // Catch: java.io.IOException -> L167
                goto L16b
            L167:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L16b:
                return r6
            L16c:
                java.lang.String r4 = new java.lang.String     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                java.nio.charset.Charset r5 = androidx.exifinterface.media.ExifInterface.ASCII     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r4.<init>(r11, r5)     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r3.close()     // Catch: java.io.IOException -> L177
                goto L17b
            L177:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L17b:
                return r4
            L17c:
                r3.close()     // Catch: java.io.IOException -> L180
                goto L184
            L180:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L184:
                return r2
            L185:
                r11 = move-exception
                goto L18b
            L187:
                r11 = move-exception
                goto L19d
            L189:
                r11 = move-exception
                r3 = r2
            L18b:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch: java.lang.Throwable -> L19b
                if (r3 == 0) goto L19a
                r3.close()     // Catch: java.io.IOException -> L196
                goto L19a
            L196:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L19a:
                return r2
            L19b:
                r11 = move-exception
                r2 = r3
            L19d:
                if (r2 == 0) goto L1a7
                r2.close()     // Catch: java.io.IOException -> L1a3
                goto L1a7
            L1a3:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L1a7:
                throw r11
        }

        public int size() {
                r2 = this;
                int[] r0 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
                int r1 = r2.format
                r0 = r0[r1]
                int r1 = r2.numberOfComponents
                int r0 = r0 * r1
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "("
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.String[] r1 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_NAMES
                int r2 = r3.format
                r1 = r1[r2]
                r0.append(r1)
                java.lang.String r1 = ", data length:"
                r0.append(r1)
                byte[] r1 = r3.bytes
                int r1 = r1.length
                java.lang.String r2 = ")"
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface ExifStreamType {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class ExifTag {
        public final java.lang.String name;
        public final int number;
        public final int primaryFormat;
        public final int secondaryFormat;

        public ExifTag(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.number = r2
                r1 = 3
                r0.primaryFormat = r1
                r1 = 4
                r0.secondaryFormat = r1
                return
        }

        public ExifTag(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.number = r2
                r0.primaryFormat = r3
                r1 = -1
                r0.secondaryFormat = r1
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface IfdType {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class Rational {
        public final long denominator;
        public final long numerator;

        public Rational(double r3) {
                r2 = this;
                r0 = 4666723172467343360(0x40c3880000000000, double:10000.0)
                double r3 = r3 * r0
                long r3 = (long) r3
                r0 = 10000(0x2710, double:4.9407E-320)
                r2.<init>(r3, r0)
                return
        }

        public Rational(long r4, long r6) {
                r3 = this;
                r3.<init>()
                r0 = 0
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 != 0) goto L10
                r3.numerator = r0
                r4 = 1
                r3.denominator = r4
                return
            L10:
                r3.numerator = r4
                r3.denominator = r6
                return
        }

        public double calculate() {
                r4 = this;
                long r0 = r4.numerator
                double r0 = (double) r0
                long r2 = r4.denominator
                double r2 = (double) r2
                double r0 = r0 / r2
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long r1 = r3.numerator
                r0.append(r1)
                java.lang.String r1 = "/"
                r0.append(r1)
                long r1 = r3.denominator
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            r0 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "ExifInterface"
            boolean r2 = android.util.Log.isLoggable(r2, r0)
            androidx.exifinterface.media.ExifInterface.DEBUG = r2
            r2 = 4
            java.lang.Integer[] r3 = new java.lang.Integer[r2]
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 0
            r3[r6] = r5
            r7 = 6
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r3[r4] = r8
            r8 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r3[r8] = r1
            r10 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r3[r0] = r11
            java.util.List r3 = java.util.Arrays.asList(r3)
            androidx.exifinterface.media.ExifInterface.ROTATION_ORDER = r3
            java.lang.Integer[] r3 = new java.lang.Integer[r2]
            r3[r6] = r9
            r12 = 7
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r3[r4] = r13
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            r3[r8] = r14
            r14 = 5
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r3[r0] = r15
            java.util.List r3 = java.util.Arrays.asList(r3)
            androidx.exifinterface.media.ExifInterface.FLIPPED_ROTATION_ORDER = r3
            int[] r3 = new int[r0]
            r3 = {x0cba: FILL_ARRAY_DATA , data: [8, 8, 8} // fill-array
            androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_RGB = r3
            int[] r3 = new int[r4]
            r3[r6] = r2
            androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_GREYSCALE_1 = r3
            int[] r3 = new int[r4]
            r3[r6] = r10
            androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_GREYSCALE_2 = r3
            byte[] r3 = new byte[r0]
            r3 = {x0cc4: FILL_ARRAY_DATA , data: [-1, -40, -1} // fill-array
            androidx.exifinterface.media.ExifInterface.JPEG_SIGNATURE = r3
            byte[] r3 = new byte[r2]
            r3 = {x0cca: FILL_ARRAY_DATA , data: [102, 116, 121, 112} // fill-array
            androidx.exifinterface.media.ExifInterface.HEIF_TYPE_FTYP = r3
            byte[] r3 = new byte[r2]
            r3 = {x0cd0: FILL_ARRAY_DATA , data: [109, 105, 102, 49} // fill-array
            androidx.exifinterface.media.ExifInterface.HEIF_BRAND_MIF1 = r3
            byte[] r3 = new byte[r2]
            r3 = {x0cd6: FILL_ARRAY_DATA , data: [104, 101, 105, 99} // fill-array
            androidx.exifinterface.media.ExifInterface.HEIF_BRAND_HEIC = r3
            byte[] r3 = new byte[r7]
            r3 = {x0cdc: FILL_ARRAY_DATA , data: [79, 76, 89, 77, 80, 0} // fill-array
            androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_HEADER_1 = r3
            r3 = 10
            byte[] r12 = new byte[r3]
            r12 = {x0ce4: FILL_ARRAY_DATA , data: [79, 76, 89, 77, 80, 85, 83, 0, 73, 73} // fill-array
            androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_HEADER_2 = r12
            byte[] r12 = new byte[r10]
            r12 = {x0cee: FILL_ARRAY_DATA , data: [-119, 80, 78, 71, 13, 10, 26, 10} // fill-array
            androidx.exifinterface.media.ExifInterface.PNG_SIGNATURE = r12
            byte[] r12 = new byte[r2]
            r12 = {x0cf6: FILL_ARRAY_DATA , data: [101, 88, 73, 102} // fill-array
            androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_EXIF = r12
            byte[] r12 = new byte[r2]
            r12 = {x0cfc: FILL_ARRAY_DATA , data: [73, 72, 68, 82} // fill-array
            androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_IHDR = r12
            byte[] r12 = new byte[r2]
            r12 = {x0d02: FILL_ARRAY_DATA , data: [73, 69, 78, 68} // fill-array
            androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_IEND = r12
            byte[] r12 = new byte[r2]
            r12 = {x0d08: FILL_ARRAY_DATA , data: [82, 73, 70, 70} // fill-array
            androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_1 = r12
            byte[] r12 = new byte[r2]
            r12 = {x0d0e: FILL_ARRAY_DATA , data: [87, 69, 66, 80} // fill-array
            androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_2 = r12
            byte[] r12 = new byte[r2]
            r12 = {x0d14: FILL_ARRAY_DATA , data: [69, 88, 73, 70} // fill-array
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_EXIF = r12
            byte[] r12 = new byte[r0]
            r12 = {x0d1a: FILL_ARRAY_DATA , data: [-99, 1, 42} // fill-array
            androidx.exifinterface.media.ExifInterface.WEBP_VP8_SIGNATURE = r12
            java.nio.charset.Charset r12 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r3 = "VP8X"
            byte[] r3 = r3.getBytes(r12)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8X = r3
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r12 = "VP8L"
            byte[] r3 = r12.getBytes(r3)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8L = r3
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r12 = "VP8 "
            byte[] r3 = r12.getBytes(r3)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8 = r3
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r12 = "ANIM"
            byte[] r3 = r12.getBytes(r3)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_ANIM = r3
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r12 = "ANMF"
            byte[] r3 = r12.getBytes(r3)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_ANMF = r3
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r12 = "XMP "
            byte[] r3 = r12.getBytes(r3)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_XMP = r3
            java.lang.String r16 = ""
            java.lang.String r17 = "BYTE"
            java.lang.String r18 = "STRING"
            java.lang.String r19 = "USHORT"
            java.lang.String r20 = "ULONG"
            java.lang.String r21 = "URATIONAL"
            java.lang.String r22 = "SBYTE"
            java.lang.String r23 = "UNDEFINED"
            java.lang.String r24 = "SSHORT"
            java.lang.String r25 = "SLONG"
            java.lang.String r26 = "SRATIONAL"
            java.lang.String r27 = "SINGLE"
            java.lang.String r28 = "DOUBLE"
            java.lang.String r29 = "IFD"
            java.lang.String[] r3 = new java.lang.String[]{r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}
            androidx.exifinterface.media.ExifInterface.IFD_FORMAT_NAMES = r3
            r3 = 14
            int[] r12 = new int[r3]
            r12 = {x0d20: FILL_ARRAY_DATA , data: [0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1} // fill-array
            androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT = r12
            byte[] r12 = new byte[r10]
            r12 = {x0d40: FILL_ARRAY_DATA , data: [65, 83, 67, 73, 73, 0, 0, 0} // fill-array
            androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX = r12
            r12 = 42
            androidx.exifinterface.media.ExifInterface$ExifTag[] r12 = new androidx.exifinterface.media.ExifInterface.ExifTag[r12]
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "NewSubfileType"
            r7 = 254(0xfe, float:3.56E-43)
            r3.<init>(r10, r7, r2)
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "SubfileType"
            r10 = 255(0xff, float:3.57E-43)
            r3.<init>(r7, r10, r2)
            r12[r4] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "ImageWidth"
            r10 = 256(0x100, float:3.59E-43)
            r3.<init>(r7, r10)
            r12[r8] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "ImageLength"
            r10 = 257(0x101, float:3.6E-43)
            r3.<init>(r7, r10)
            r12[r0] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "BitsPerSample"
            r10 = 258(0x102, float:3.62E-43)
            r3.<init>(r7, r10, r0)
            r12[r2] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "Compression"
            r10 = 259(0x103, float:3.63E-43)
            r3.<init>(r7, r10, r0)
            r12[r14] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "PhotometricInterpretation"
            r10 = 262(0x106, float:3.67E-43)
            r3.<init>(r7, r10, r0)
            r7 = 6
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "ImageDescription"
            r10 = 270(0x10e, float:3.78E-43)
            r3.<init>(r7, r10, r8)
            r7 = 7
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "Make"
            r10 = 271(0x10f, float:3.8E-43)
            r3.<init>(r7, r10, r8)
            r7 = 8
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "Model"
            r10 = 272(0x110, float:3.81E-43)
            r3.<init>(r7, r10, r8)
            r7 = 9
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "StripOffsets"
            r7 = 273(0x111, float:3.83E-43)
            r3.<init>(r10, r7)
            r7 = 10
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "Orientation"
            r10 = 274(0x112, float:3.84E-43)
            r3.<init>(r7, r10, r0)
            r7 = 11
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "SamplesPerPixel"
            r10 = 277(0x115, float:3.88E-43)
            r3.<init>(r7, r10, r0)
            r7 = 12
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "RowsPerStrip"
            r10 = 278(0x116, float:3.9E-43)
            r3.<init>(r7, r10)
            r7 = 13
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "StripByteCounts"
            r10 = 279(0x117, float:3.91E-43)
            r3.<init>(r7, r10)
            r7 = 14
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "XResolution"
            r10 = 282(0x11a, float:3.95E-43)
            r3.<init>(r7, r10, r14)
            r7 = 15
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "YResolution"
            r10 = 283(0x11b, float:3.97E-43)
            r3.<init>(r7, r10, r14)
            r7 = 16
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "PlanarConfiguration"
            r10 = 284(0x11c, float:3.98E-43)
            r3.<init>(r7, r10, r0)
            r7 = 17
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "ResolutionUnit"
            r10 = 296(0x128, float:4.15E-43)
            r3.<init>(r7, r10, r0)
            r7 = 18
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "TransferFunction"
            r10 = 301(0x12d, float:4.22E-43)
            r3.<init>(r7, r10, r0)
            r7 = 19
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "Software"
            r10 = 305(0x131, float:4.27E-43)
            r3.<init>(r7, r10, r8)
            r7 = 20
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "DateTime"
            r10 = 306(0x132, float:4.29E-43)
            r3.<init>(r7, r10, r8)
            r7 = 21
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "Artist"
            r7 = 315(0x13b, float:4.41E-43)
            r3.<init>(r10, r7, r8)
            r7 = 22
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "WhitePoint"
            r7 = 318(0x13e, float:4.46E-43)
            r3.<init>(r10, r7, r14)
            r7 = 23
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "PrimaryChromaticities"
            r6 = 319(0x13f, float:4.47E-43)
            r3.<init>(r10, r6, r14)
            r6 = 24
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "SubIFDPointer"
            r6 = 330(0x14a, float:4.62E-43)
            r3.<init>(r10, r6, r2)
            r6 = 25
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "JPEGInterchangeFormat"
            r6 = 513(0x201, float:7.19E-43)
            r3.<init>(r10, r6, r2)
            r6 = 26
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "JPEGInterchangeFormatLength"
            r6 = 514(0x202, float:7.2E-43)
            r3.<init>(r10, r6, r2)
            r6 = 27
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "YCbCrCoefficients"
            r6 = 529(0x211, float:7.41E-43)
            r3.<init>(r10, r6, r14)
            r6 = 28
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "YCbCrSubSampling"
            r6 = 530(0x212, float:7.43E-43)
            r3.<init>(r10, r6, r0)
            r6 = 29
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "YCbCrPositioning"
            r6 = 531(0x213, float:7.44E-43)
            r3.<init>(r10, r6, r0)
            r6 = 30
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "ReferenceBlackWhite"
            r6 = 532(0x214, float:7.45E-43)
            r3.<init>(r10, r6, r14)
            r6 = 31
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "Copyright"
            r6 = 33432(0x8298, float:4.6848E-41)
            r3.<init>(r10, r6, r8)
            r6 = 32
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ExifIFDPointer"
            r10 = 34665(0x8769, float:4.8576E-41)
            r3.<init>(r6, r10, r2)
            r6 = 33
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSInfoIFDPointer"
            r10 = 34853(0x8825, float:4.884E-41)
            r3.<init>(r6, r10, r2)
            r6 = 34
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SensorTopBorder"
            r3.<init>(r6, r2, r2)
            r6 = 35
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SensorLeftBorder"
            r3.<init>(r6, r14, r2)
            r6 = 36
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SensorBottomBorder"
            r10 = 6
            r3.<init>(r6, r10, r2)
            r6 = 37
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SensorRightBorder"
            r10 = 7
            r3.<init>(r6, r10, r2)
            r6 = 38
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ISO"
            r3.<init>(r6, r7, r0)
            r6 = 39
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "JpgFromRaw"
            r7 = 46
            r3.<init>(r6, r7, r10)
            r6 = 40
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "Xmp"
            r7 = 700(0x2bc, float:9.81E-43)
            r3.<init>(r6, r7, r4)
            r6 = 41
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface.IFD_TIFF_TAGS = r12
            r3 = 74
            androidx.exifinterface.media.ExifInterface$ExifTag[] r3 = new androidx.exifinterface.media.ExifInterface.ExifTag[r3]
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "ExposureTime"
            r10 = 33434(0x829a, float:4.6851E-41)
            r6.<init>(r7, r10, r14)
            r7 = 0
            r3[r7] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "FNumber"
            r10 = 33437(0x829d, float:4.6855E-41)
            r6.<init>(r7, r10, r14)
            r3[r4] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "ExposureProgram"
            r10 = 34850(0x8822, float:4.8835E-41)
            r6.<init>(r7, r10, r0)
            r3[r8] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "SpectralSensitivity"
            r10 = 34852(0x8824, float:4.8838E-41)
            r6.<init>(r7, r10, r8)
            r3[r0] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "PhotographicSensitivity"
            r10 = 34855(0x8827, float:4.8842E-41)
            r6.<init>(r7, r10, r0)
            r3[r2] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "OECF"
            r10 = 34856(0x8828, float:4.8844E-41)
            r4 = 7
            r6.<init>(r7, r10, r4)
            r3[r14] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "SensitivityType"
            r10 = 34864(0x8830, float:4.8855E-41)
            r6.<init>(r7, r10, r0)
            r7 = 6
            r3[r7] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "StandardOutputSensitivity"
            r10 = 34865(0x8831, float:4.8856E-41)
            r6.<init>(r7, r10, r2)
            r3[r4] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "RecommendedExposureIndex"
            r7 = 34866(0x8832, float:4.8858E-41)
            r4.<init>(r6, r7, r2)
            r6 = 8
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ISOSpeed"
            r7 = 34867(0x8833, float:4.8859E-41)
            r4.<init>(r6, r7, r2)
            r6 = 9
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ISOSpeedLatitudeyyy"
            r7 = 34868(0x8834, float:4.886E-41)
            r4.<init>(r6, r7, r2)
            r6 = 10
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ISOSpeedLatitudezzz"
            r7 = 34869(0x8835, float:4.8862E-41)
            r4.<init>(r6, r7, r2)
            r6 = 11
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ExifVersion"
            r7 = 36864(0x9000, float:5.1657E-41)
            r4.<init>(r6, r7, r8)
            r6 = 12
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "DateTimeOriginal"
            r7 = 36867(0x9003, float:5.1662E-41)
            r4.<init>(r6, r7, r8)
            r6 = 13
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "DateTimeDigitized"
            r7 = 36868(0x9004, float:5.1663E-41)
            r4.<init>(r6, r7, r8)
            r6 = 14
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "OffsetTime"
            r7 = 36880(0x9010, float:5.168E-41)
            r4.<init>(r6, r7, r8)
            r6 = 15
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "OffsetTimeOriginal"
            r7 = 36881(0x9011, float:5.1681E-41)
            r4.<init>(r6, r7, r8)
            r6 = 16
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "OffsetTimeDigitized"
            r7 = 36882(0x9012, float:5.1683E-41)
            r4.<init>(r6, r7, r8)
            r6 = 17
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ComponentsConfiguration"
            r7 = 37121(0x9101, float:5.2018E-41)
            r10 = 7
            r4.<init>(r6, r7, r10)
            r6 = 18
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "CompressedBitsPerPixel"
            r7 = 37122(0x9102, float:5.2019E-41)
            r4.<init>(r6, r7, r14)
            r6 = 19
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ShutterSpeedValue"
            r7 = 37377(0x9201, float:5.2376E-41)
            r10 = 10
            r4.<init>(r6, r7, r10)
            r6 = 20
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ApertureValue"
            r7 = 37378(0x9202, float:5.2378E-41)
            r4.<init>(r6, r7, r14)
            r6 = 21
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "BrightnessValue"
            r7 = 37379(0x9203, float:5.2379E-41)
            r4.<init>(r6, r7, r10)
            r6 = 22
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ExposureBiasValue"
            r7 = 37380(0x9204, float:5.238E-41)
            r4.<init>(r6, r7, r10)
            r6 = 23
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "MaxApertureValue"
            r7 = 37381(0x9205, float:5.2382E-41)
            r4.<init>(r6, r7, r14)
            r6 = 24
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SubjectDistance"
            r7 = 37382(0x9206, float:5.2383E-41)
            r4.<init>(r6, r7, r14)
            r6 = 25
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "MeteringMode"
            r7 = 37383(0x9207, float:5.2385E-41)
            r4.<init>(r6, r7, r0)
            r6 = 26
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "LightSource"
            r7 = 37384(0x9208, float:5.2386E-41)
            r4.<init>(r6, r7, r0)
            r6 = 27
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "Flash"
            r7 = 37385(0x9209, float:5.2388E-41)
            r4.<init>(r6, r7, r0)
            r6 = 28
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "FocalLength"
            r7 = 37386(0x920a, float:5.2389E-41)
            r4.<init>(r6, r7, r14)
            r6 = 29
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SubjectArea"
            r7 = 37396(0x9214, float:5.2403E-41)
            r4.<init>(r6, r7, r0)
            r6 = 30
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "MakerNote"
            r7 = 37500(0x927c, float:5.2549E-41)
            r10 = 7
            r4.<init>(r6, r7, r10)
            r6 = 31
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "UserComment"
            r7 = 37510(0x9286, float:5.2563E-41)
            r4.<init>(r6, r7, r10)
            r6 = 32
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SubSecTime"
            r7 = 37520(0x9290, float:5.2577E-41)
            r4.<init>(r6, r7, r8)
            r6 = 33
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SubSecTimeOriginal"
            r7 = 37521(0x9291, float:5.2578E-41)
            r4.<init>(r6, r7, r8)
            r6 = 34
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SubSecTimeDigitized"
            r7 = 37522(0x9292, float:5.258E-41)
            r4.<init>(r6, r7, r8)
            r6 = 35
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "FlashpixVersion"
            r7 = 40960(0xa000, float:5.7397E-41)
            r10 = 7
            r4.<init>(r6, r7, r10)
            r6 = 36
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ColorSpace"
            r7 = 40961(0xa001, float:5.7399E-41)
            r4.<init>(r6, r7, r0)
            r6 = 37
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "PixelXDimension"
            r7 = 40962(0xa002, float:5.74E-41)
            r4.<init>(r6, r7)
            r6 = 38
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "PixelYDimension"
            r7 = 40963(0xa003, float:5.7401E-41)
            r4.<init>(r6, r7)
            r6 = 39
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "RelatedSoundFile"
            r7 = 40964(0xa004, float:5.7403E-41)
            r4.<init>(r6, r7, r8)
            r6 = 40
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "InteroperabilityIFDPointer"
            r7 = 40965(0xa005, float:5.7404E-41)
            r4.<init>(r6, r7, r2)
            r6 = 41
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "FlashEnergy"
            r7 = 41483(0xa20b, float:5.813E-41)
            r4.<init>(r6, r7, r14)
            r6 = 42
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SpatialFrequencyResponse"
            r7 = 41484(0xa20c, float:5.8131E-41)
            r10 = 7
            r4.<init>(r6, r7, r10)
            r6 = 43
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "FocalPlaneXResolution"
            r7 = 41486(0xa20e, float:5.8134E-41)
            r4.<init>(r6, r7, r14)
            r6 = 44
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "FocalPlaneYResolution"
            r7 = 41487(0xa20f, float:5.8136E-41)
            r4.<init>(r6, r7, r14)
            r6 = 45
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "FocalPlaneResolutionUnit"
            r7 = 41488(0xa210, float:5.8137E-41)
            r4.<init>(r6, r7, r0)
            r6 = 46
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SubjectLocation"
            r7 = 41492(0xa214, float:5.8143E-41)
            r4.<init>(r6, r7, r0)
            r6 = 47
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ExposureIndex"
            r7 = 41493(0xa215, float:5.8144E-41)
            r4.<init>(r6, r7, r14)
            r6 = 48
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SensingMethod"
            r7 = 41495(0xa217, float:5.8147E-41)
            r4.<init>(r6, r7, r0)
            r6 = 49
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "FileSource"
            r7 = 41728(0xa300, float:5.8473E-41)
            r10 = 7
            r4.<init>(r6, r7, r10)
            r6 = 50
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SceneType"
            r7 = 41729(0xa301, float:5.8475E-41)
            r4.<init>(r6, r7, r10)
            r6 = 51
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "CFAPattern"
            r7 = 41730(0xa302, float:5.8476E-41)
            r4.<init>(r6, r7, r10)
            r6 = 52
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "CustomRendered"
            r7 = 41985(0xa401, float:5.8834E-41)
            r4.<init>(r6, r7, r0)
            r6 = 53
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ExposureMode"
            r7 = 41986(0xa402, float:5.8835E-41)
            r4.<init>(r6, r7, r0)
            r6 = 54
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "WhiteBalance"
            r7 = 41987(0xa403, float:5.8836E-41)
            r4.<init>(r6, r7, r0)
            r6 = 55
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "DigitalZoomRatio"
            r7 = 41988(0xa404, float:5.8838E-41)
            r4.<init>(r6, r7, r14)
            r6 = 56
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "FocalLengthIn35mmFilm"
            r7 = 41989(0xa405, float:5.8839E-41)
            r4.<init>(r6, r7, r0)
            r6 = 57
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SceneCaptureType"
            r7 = 41990(0xa406, float:5.884E-41)
            r4.<init>(r6, r7, r0)
            r6 = 58
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GainControl"
            r7 = 41991(0xa407, float:5.8842E-41)
            r4.<init>(r6, r7, r0)
            r6 = 59
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "Contrast"
            r7 = 41992(0xa408, float:5.8843E-41)
            r4.<init>(r6, r7, r0)
            r6 = 60
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "Saturation"
            r7 = 41993(0xa409, float:5.8845E-41)
            r4.<init>(r6, r7, r0)
            r6 = 61
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "Sharpness"
            r7 = 41994(0xa40a, float:5.8846E-41)
            r4.<init>(r6, r7, r0)
            r6 = 62
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "DeviceSettingDescription"
            r7 = 41995(0xa40b, float:5.8848E-41)
            r10 = 7
            r4.<init>(r6, r7, r10)
            r6 = 63
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SubjectDistanceRange"
            r7 = 41996(0xa40c, float:5.8849E-41)
            r4.<init>(r6, r7, r0)
            r6 = 64
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ImageUniqueID"
            r7 = 42016(0xa420, float:5.8877E-41)
            r4.<init>(r6, r7, r8)
            r6 = 65
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "CameraOwnerName"
            r7 = 42032(0xa430, float:5.89E-41)
            r4.<init>(r6, r7, r8)
            r6 = 66
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "BodySerialNumber"
            r7 = 42033(0xa431, float:5.8901E-41)
            r4.<init>(r6, r7, r8)
            r6 = 67
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "LensSpecification"
            r7 = 42034(0xa432, float:5.8902E-41)
            r4.<init>(r6, r7, r14)
            r6 = 68
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "LensMake"
            r7 = 42035(0xa433, float:5.8904E-41)
            r4.<init>(r6, r7, r8)
            r6 = 69
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "LensModel"
            r7 = 42036(0xa434, float:5.8905E-41)
            r4.<init>(r6, r7, r8)
            r6 = 70
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "Gamma"
            r7 = 42240(0xa500, float:5.9191E-41)
            r4.<init>(r6, r7, r14)
            r6 = 71
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "DNGVersion"
            r7 = 50706(0xc612, float:7.1054E-41)
            r10 = 1
            r4.<init>(r6, r7, r10)
            r6 = 72
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "DefaultCropSize"
            r7 = 50720(0xc620, float:7.1074E-41)
            r4.<init>(r6, r7)
            r6 = 73
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface.IFD_EXIF_TAGS = r3
            r4 = 32
            androidx.exifinterface.media.ExifInterface$ExifTag[] r4 = new androidx.exifinterface.media.ExifInterface.ExifTag[r4]
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "GPSVersionID"
            r2 = 1
            r10 = 0
            r6.<init>(r7, r10, r2)
            r4[r10] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "GPSLatitudeRef"
            r6.<init>(r7, r2, r8)
            r4[r2] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSLatitude"
            r2.<init>(r6, r8, r14)
            r4[r8] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSLongitudeRef"
            r2.<init>(r6, r0, r8)
            r4[r0] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSLongitude"
            r7 = 4
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSAltitudeRef"
            r7 = 1
            r2.<init>(r6, r14, r7)
            r4[r14] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSAltitude"
            r7 = 6
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSTimeStamp"
            r7 = 7
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSSatellites"
            r7 = 8
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSStatus"
            r7 = 9
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSMeasureMode"
            r7 = 10
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDOP"
            r7 = 11
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSSpeedRef"
            r7 = 12
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSSpeed"
            r7 = 13
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSTrackRef"
            r7 = 14
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSTrack"
            r7 = 15
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSImgDirectionRef"
            r7 = 16
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSImgDirection"
            r7 = 17
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSMapDatum"
            r7 = 18
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDestLatitudeRef"
            r7 = 19
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDestLatitude"
            r7 = 20
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDestLongitudeRef"
            r7 = 21
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDestLongitude"
            r7 = 22
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDestBearingRef"
            r7 = 23
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDestBearing"
            r7 = 24
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDestDistanceRef"
            r7 = 25
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDestDistance"
            r7 = 26
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSProcessingMethod"
            r7 = 27
            r10 = 7
            r2.<init>(r6, r7, r10)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSAreaInformation"
            r7 = 28
            r2.<init>(r6, r7, r10)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDateStamp"
            r7 = 29
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDifferential"
            r7 = 30
            r2.<init>(r6, r7, r0)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSHPositioningError"
            r7 = 31
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            androidx.exifinterface.media.ExifInterface.IFD_GPS_TAGS = r4
            r2 = 1
            androidx.exifinterface.media.ExifInterface$ExifTag[] r6 = new androidx.exifinterface.media.ExifInterface.ExifTag[r2]
            androidx.exifinterface.media.ExifInterface$ExifTag r7 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "InteroperabilityIndex"
            r7.<init>(r10, r2, r8)
            r2 = 0
            r6[r2] = r7
            androidx.exifinterface.media.ExifInterface.IFD_INTEROPERABILITY_TAGS = r6
            r7 = 37
            androidx.exifinterface.media.ExifInterface$ExifTag[] r7 = new androidx.exifinterface.media.ExifInterface.ExifTag[r7]
            androidx.exifinterface.media.ExifInterface$ExifTag r10 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "NewSubfileType"
            r0 = 254(0xfe, float:3.56E-43)
            r8 = 4
            r10.<init>(r14, r0, r8)
            r7[r2] = r10
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "SubfileType"
            r10 = 255(0xff, float:3.57E-43)
            r0.<init>(r2, r10, r8)
            r2 = 1
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "ThumbnailImageWidth"
            r8 = 256(0x100, float:3.59E-43)
            r0.<init>(r2, r8)
            r2 = 2
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "ThumbnailImageLength"
            r8 = 257(0x101, float:3.6E-43)
            r0.<init>(r2, r8)
            r2 = 3
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "BitsPerSample"
            r10 = 258(0x102, float:3.62E-43)
            r0.<init>(r8, r10, r2)
            r8 = 4
            r7[r8] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "Compression"
            r10 = 259(0x103, float:3.63E-43)
            r0.<init>(r8, r10, r2)
            r8 = 5
            r7[r8] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "PhotometricInterpretation"
            r10 = 262(0x106, float:3.67E-43)
            r0.<init>(r8, r10, r2)
            r2 = 6
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "ImageDescription"
            r8 = 270(0x10e, float:3.78E-43)
            r10 = 2
            r0.<init>(r2, r8, r10)
            r2 = 7
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "Make"
            r8 = 271(0x10f, float:3.8E-43)
            r0.<init>(r2, r8, r10)
            r2 = 8
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "Model"
            r8 = 272(0x110, float:3.81E-43)
            r0.<init>(r2, r8, r10)
            r2 = 9
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "StripOffsets"
            r8 = 273(0x111, float:3.83E-43)
            r0.<init>(r2, r8)
            r2 = 10
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "ThumbnailOrientation"
            r8 = 274(0x112, float:3.84E-43)
            r10 = 3
            r0.<init>(r2, r8, r10)
            r2 = 11
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "SamplesPerPixel"
            r8 = 277(0x115, float:3.88E-43)
            r0.<init>(r2, r8, r10)
            r2 = 12
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "RowsPerStrip"
            r8 = 278(0x116, float:3.9E-43)
            r0.<init>(r2, r8)
            r2 = 13
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "StripByteCounts"
            r8 = 279(0x117, float:3.91E-43)
            r0.<init>(r2, r8)
            r2 = 14
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "XResolution"
            r8 = 282(0x11a, float:3.95E-43)
            r10 = 5
            r0.<init>(r2, r8, r10)
            r2 = 15
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "YResolution"
            r8 = 283(0x11b, float:3.97E-43)
            r0.<init>(r2, r8, r10)
            r2 = 16
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "PlanarConfiguration"
            r8 = 284(0x11c, float:3.98E-43)
            r10 = 3
            r0.<init>(r2, r8, r10)
            r2 = 17
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "ResolutionUnit"
            r8 = 296(0x128, float:4.15E-43)
            r0.<init>(r2, r8, r10)
            r2 = 18
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "TransferFunction"
            r8 = 301(0x12d, float:4.22E-43)
            r0.<init>(r2, r8, r10)
            r2 = 19
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "Software"
            r8 = 305(0x131, float:4.27E-43)
            r10 = 2
            r0.<init>(r2, r8, r10)
            r2 = 20
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "DateTime"
            r8 = 306(0x132, float:4.29E-43)
            r0.<init>(r2, r8, r10)
            r2 = 21
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "Artist"
            r8 = 315(0x13b, float:4.41E-43)
            r0.<init>(r2, r8, r10)
            r2 = 22
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "WhitePoint"
            r8 = 318(0x13e, float:4.46E-43)
            r10 = 5
            r0.<init>(r2, r8, r10)
            r2 = 23
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "PrimaryChromaticities"
            r8 = 319(0x13f, float:4.47E-43)
            r0.<init>(r2, r8, r10)
            r2 = 24
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "SubIFDPointer"
            r8 = 330(0x14a, float:4.62E-43)
            r10 = 4
            r0.<init>(r2, r8, r10)
            r2 = 25
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "JPEGInterchangeFormat"
            r8 = 513(0x201, float:7.19E-43)
            r0.<init>(r2, r8, r10)
            r2 = 26
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r8 = 514(0x202, float:7.2E-43)
            r0.<init>(r2, r8, r10)
            r2 = 27
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "YCbCrCoefficients"
            r8 = 529(0x211, float:7.41E-43)
            r10 = 5
            r0.<init>(r2, r8, r10)
            r2 = 28
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "YCbCrSubSampling"
            r8 = 530(0x212, float:7.43E-43)
            r10 = 3
            r0.<init>(r2, r8, r10)
            r2 = 29
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "YCbCrPositioning"
            r8 = 531(0x213, float:7.44E-43)
            r0.<init>(r2, r8, r10)
            r2 = 30
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "ReferenceBlackWhite"
            r8 = 532(0x214, float:7.45E-43)
            r10 = 5
            r0.<init>(r2, r8, r10)
            r2 = 31
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "Copyright"
            r8 = 33432(0x8298, float:4.6848E-41)
            r10 = 2
            r0.<init>(r2, r8, r10)
            r2 = 32
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "ExifIFDPointer"
            r8 = 34665(0x8769, float:4.8576E-41)
            r10 = 4
            r0.<init>(r2, r8, r10)
            r2 = 33
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "GPSInfoIFDPointer"
            r8 = 34853(0x8825, float:4.884E-41)
            r0.<init>(r2, r8, r10)
            r2 = 34
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "DNGVersion"
            r8 = 50706(0xc612, float:7.1054E-41)
            r10 = 1
            r0.<init>(r2, r8, r10)
            r2 = 35
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "DefaultCropSize"
            r8 = 50720(0xc620, float:7.1074E-41)
            r0.<init>(r2, r8)
            r2 = 36
            r7[r2] = r0
            androidx.exifinterface.media.ExifInterface.IFD_THUMBNAIL_TAGS = r7
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "StripOffsets"
            r8 = 273(0x111, float:3.83E-43)
            r10 = 3
            r0.<init>(r2, r8, r10)
            androidx.exifinterface.media.ExifInterface.TAG_RAF_IMAGE_SIZE = r0
            androidx.exifinterface.media.ExifInterface$ExifTag[] r0 = new androidx.exifinterface.media.ExifInterface.ExifTag[r10]
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "ThumbnailImage"
            r10 = 256(0x100, float:3.59E-43)
            r14 = 7
            r2.<init>(r8, r10, r14)
            r8 = 0
            r0[r8] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "CameraSettingsIFDPointer"
            r10 = 8224(0x2020, float:1.1524E-41)
            r14 = 4
            r2.<init>(r8, r10, r14)
            r8 = 1
            r0[r8] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "ImageProcessingIFDPointer"
            r10 = 8256(0x2040, float:1.1569E-41)
            r2.<init>(r8, r10, r14)
            r8 = 2
            r0[r8] = r2
            androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_TAGS = r0
            androidx.exifinterface.media.ExifInterface$ExifTag[] r2 = new androidx.exifinterface.media.ExifInterface.ExifTag[r8]
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "PreviewImageStart"
            r16 = r11
            r11 = 257(0x101, float:3.6E-43)
            r8.<init>(r10, r11, r14)
            r10 = 0
            r2[r10] = r8
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "PreviewImageLength"
            r11 = 258(0x102, float:3.62E-43)
            r8.<init>(r10, r11, r14)
            r10 = 1
            r2[r10] = r8
            androidx.exifinterface.media.ExifInterface.ORF_CAMERA_SETTINGS_TAGS = r2
            androidx.exifinterface.media.ExifInterface$ExifTag[] r8 = new androidx.exifinterface.media.ExifInterface.ExifTag[r10]
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "AspectFrame"
            r10 = 4371(0x1113, float:6.125E-42)
            r20 = r13
            r13 = 3
            r11.<init>(r14, r10, r13)
            r10 = 0
            r8[r10] = r11
            androidx.exifinterface.media.ExifInterface.ORF_IMAGE_PROCESSING_TAGS = r8
            r11 = 1
            androidx.exifinterface.media.ExifInterface$ExifTag[] r14 = new androidx.exifinterface.media.ExifInterface.ExifTag[r11]
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "ColorSpace"
            r21 = r1
            r1 = 55
            r11.<init>(r10, r1, r13)
            r1 = 0
            r14[r1] = r11
            androidx.exifinterface.media.ExifInterface.PEF_TAGS = r14
            r10 = 10
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r11 = new androidx.exifinterface.media.ExifInterface.ExifTag[r10][]
            r11[r1] = r12
            r1 = 1
            r11[r1] = r3
            r1 = 2
            r11[r1] = r4
            r11[r13] = r6
            r1 = 4
            r11[r1] = r7
            r3 = 5
            r11[r3] = r12
            r3 = 6
            r11[r3] = r0
            r0 = 7
            r11[r0] = r2
            r0 = 8
            r11[r0] = r8
            r0 = 9
            r11[r0] = r14
            androidx.exifinterface.media.ExifInterface.EXIF_TAGS = r11
            androidx.exifinterface.media.ExifInterface$ExifTag[] r0 = new androidx.exifinterface.media.ExifInterface.ExifTag[r3]
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r3 = "SubIFDPointer"
            r4 = 330(0x14a, float:4.62E-43)
            r2.<init>(r3, r4, r1)
            r3 = 0
            r0[r3] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r3 = "ExifIFDPointer"
            r4 = 34665(0x8769, float:4.8576E-41)
            r2.<init>(r3, r4, r1)
            r3 = 1
            r0[r3] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r3 = "GPSInfoIFDPointer"
            r4 = 34853(0x8825, float:4.884E-41)
            r2.<init>(r3, r4, r1)
            r3 = 2
            r0[r3] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r3 = "InteroperabilityIFDPointer"
            r4 = 40965(0xa005, float:5.7404E-41)
            r2.<init>(r3, r4, r1)
            r3 = 3
            r0[r3] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r3 = "CameraSettingsIFDPointer"
            r4 = 8224(0x2020, float:1.1524E-41)
            r6 = 1
            r2.<init>(r3, r4, r6)
            r0[r1] = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r3 = "ImageProcessingIFDPointer"
            r4 = 8256(0x2040, float:1.1569E-41)
            r2.<init>(r3, r4, r6)
            r3 = 5
            r0[r3] = r2
            androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "JPEGInterchangeFormat"
            r3 = 513(0x201, float:7.19E-43)
            r0.<init>(r2, r3, r1)
            androidx.exifinterface.media.ExifInterface.JPEG_INTERCHANGE_FORMAT_TAG = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r3 = 514(0x202, float:7.2E-43)
            r0.<init>(r2, r3, r1)
            androidx.exifinterface.media.ExifInterface.JPEG_INTERCHANGE_FORMAT_LENGTH_TAG = r0
            r0 = 10
            java.util.HashMap[] r1 = new java.util.HashMap[r0]
            androidx.exifinterface.media.ExifInterface.sExifTagMapsForReading = r1
            java.util.HashMap[] r0 = new java.util.HashMap[r0]
            androidx.exifinterface.media.ExifInterface.sExifTagMapsForWriting = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "FNumber"
            java.lang.String r2 = "DigitalZoomRatio"
            java.lang.String r3 = "ExposureTime"
            java.lang.String r4 = "SubjectDistance"
            java.lang.String r6 = "GPSTimeStamp"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r6}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            androidx.exifinterface.media.ExifInterface.sTagSetForCompatibility = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.exifinterface.media.ExifInterface.sExifPointerTagMap = r0
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            androidx.exifinterface.media.ExifInterface.ASCII = r0
            java.lang.String r1 = "Exif\u0000\u0000"
            byte[] r1 = r1.getBytes(r0)
            androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1 = r1
            java.lang.String r1 = "http://ns.adobe.com/xap/1.0/\u0000"
            byte[] r0 = r1.getBytes(r0)
            androidx.exifinterface.media.ExifInterface.IDENTIFIER_XMP_APP1 = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy:MM:dd HH:mm:ss"
            r0.<init>(r1)
            androidx.exifinterface.media.ExifInterface.sFormatter = r0
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
            r7 = 0
        Lc1c:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r0 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r0.length
            if (r7 >= r1) goto Lc57
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface$ExifTag>[] r1 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForReading
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1[r7] = r2
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifTag>[] r1 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForWriting
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1[r7] = r2
            r0 = r0[r7]
            int r1 = r0.length
            r2 = 0
        Lc37:
            if (r2 >= r1) goto Lc54
            r3 = r0[r2]
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface$ExifTag>[] r4 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForReading
            r4 = r4[r7]
            int r6 = r3.number
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r6, r3)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifTag>[] r4 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForWriting
            r4 = r4[r7]
            java.lang.String r6 = r3.name
            r4.put(r6, r3)
            int r2 = r2 + 1
            goto Lc37
        Lc54:
            int r7 = r7 + 1
            goto Lc1c
        Lc57:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = androidx.exifinterface.media.ExifInterface.sExifPointerTagMap
            androidx.exifinterface.media.ExifInterface$ExifTag[] r1 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r2 = 0
            r2 = r1[r2]
            int r2 = r2.number
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r15)
            r2 = 1
            r2 = r1[r2]
            int r2 = r2.number
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r5)
            r2 = 2
            r2 = r1[r2]
            int r2 = r2.number
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r9)
            r2 = 3
            r2 = r1[r2]
            int r2 = r2.number
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = r21
            r0.put(r2, r3)
            r2 = 4
            r2 = r1[r2]
            int r2 = r2.number
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = r20
            r0.put(r2, r3)
            r2 = 5
            r1 = r1[r2]
            int r1 = r1.number
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = r16
            r0.put(r1, r2)
            java.lang.String r0 = ".*[1-9].*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.exifinterface.media.ExifInterface.sNonZeroTimePattern = r0
            java.lang.String r0 = "^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.exifinterface.media.ExifInterface.sGpsTimestampPattern = r0
            return
    }

    public ExifInterface(@androidx.annotation.NonNull java.io.File r3) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r0 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r2.mAttributes = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r2.mAttributesOffsets = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r2.mExifByteOrder = r0
            java.lang.String r0 = "file cannot be null"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r3 = r3.getAbsolutePath()
            r2.initForFilename(r3)
            return
    }

    public ExifInterface(@androidx.annotation.NonNull java.io.FileDescriptor r5) throws java.io.IOException {
            r4 = this;
            r4.<init>()
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r0 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r4.mAttributes = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r4.mAttributesOffsets = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r4.mExifByteOrder = r0
            java.lang.String r0 = "fileDescriptor cannot be null"
            java.util.Objects.requireNonNull(r5, r0)
            r0 = 0
            r4.mAssetInputStream = r0
            r4.mFilename = r0
            r1 = 0
            boolean r2 = isSeekableFD(r5)
            if (r2 == 0) goto L38
            r4.mSeekableFileDescriptor = r5
            java.io.FileDescriptor r5 = android.system.Os.dup(r5)     // Catch: java.lang.Exception -> L2f
            r1 = 1
            goto L3a
        L2f:
            r5 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to duplicate file descriptor"
            r0.<init>(r1, r5)
            throw r0
        L38:
            r4.mSeekableFileDescriptor = r0
        L3a:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L4d
            r4.loadAttributes(r2)     // Catch: java.lang.Throwable -> L4b
            closeQuietly(r2)
            if (r1 == 0) goto L4a
            closeFileDescriptor(r5)
        L4a:
            return
        L4b:
            r0 = move-exception
            goto L51
        L4d:
            r2 = move-exception
            r3 = r2
            r2 = r0
            r0 = r3
        L51:
            closeQuietly(r2)
            if (r1 == 0) goto L59
            closeFileDescriptor(r5)
        L59:
            throw r0
    }

    public ExifInterface(@androidx.annotation.NonNull java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ExifInterface(@androidx.annotation.NonNull java.io.InputStream r2, int r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            if (r3 != r0) goto L4
            goto L5
        L4:
            r0 = 0
        L5:
            r1.<init>(r2, r0)
            return
    }

    private ExifInterface(@androidx.annotation.NonNull java.io.InputStream r3, boolean r4) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r0 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r2.mAttributes = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r2.mAttributesOffsets = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r2.mExifByteOrder = r0
            java.lang.String r0 = "inputStream cannot be null"
            java.util.Objects.requireNonNull(r3, r0)
            r0 = 0
            r2.mFilename = r0
            if (r4 == 0) goto L3e
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream
            r1 = 5000(0x1388, float:7.006E-42)
            r4.<init>(r3, r1)
            boolean r3 = isExifDataOnly(r4)
            if (r3 != 0) goto L35
            java.lang.String r3 = "ExifInterface"
            java.lang.String r4 = "Given data does not follow the structure of an Exif-only data."
            android.util.Log.w(r3, r4)
            return
        L35:
            r3 = 1
            r2.mIsExifDataOnly = r3
            r2.mAssetInputStream = r0
            r2.mSeekableFileDescriptor = r0
            r3 = r4
            goto L68
        L3e:
            boolean r4 = r3 instanceof android.content.res.AssetManager.AssetInputStream
            if (r4 == 0) goto L4a
            r4 = r3
            android.content.res.AssetManager$AssetInputStream r4 = (android.content.res.AssetManager.AssetInputStream) r4
            r2.mAssetInputStream = r4
            r2.mSeekableFileDescriptor = r0
            goto L68
        L4a:
            boolean r4 = r3 instanceof java.io.FileInputStream
            if (r4 == 0) goto L64
            r4 = r3
            java.io.FileInputStream r4 = (java.io.FileInputStream) r4
            java.io.FileDescriptor r1 = r4.getFD()
            boolean r1 = isSeekableFD(r1)
            if (r1 == 0) goto L64
            r2.mAssetInputStream = r0
            java.io.FileDescriptor r4 = r4.getFD()
            r2.mSeekableFileDescriptor = r4
            goto L68
        L64:
            r2.mAssetInputStream = r0
            r2.mSeekableFileDescriptor = r0
        L68:
            r2.loadAttributes(r3)
            return
    }

    public ExifInterface(@androidx.annotation.NonNull java.lang.String r3) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r0 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r2.mAttributes = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r2.mAttributesOffsets = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r2.mExifByteOrder = r0
            java.lang.String r0 = "filename cannot be null"
            java.util.Objects.requireNonNull(r3, r0)
            r2.initForFilename(r3)
            return
    }

    private void addDefaultValuesForCompatibility() {
            r6 = this;
            java.lang.String r0 = "DateTimeOriginal"
            java.lang.String r0 = r6.getAttribute(r0)
            r1 = 0
            if (r0 == 0) goto L1c
            java.lang.String r2 = "DateTime"
            java.lang.String r3 = r6.getAttribute(r2)
            if (r3 != 0) goto L1c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r6.mAttributes
            r3 = r3[r1]
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createString(r0)
            r3.put(r2, r0)
        L1c:
            java.lang.String r0 = "ImageWidth"
            java.lang.String r2 = r6.getAttribute(r0)
            r3 = 0
            if (r2 != 0) goto L33
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r2 = r2[r1]
            java.nio.ByteOrder r5 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r3, r5)
            r2.put(r0, r5)
        L33:
            java.lang.String r0 = "ImageLength"
            java.lang.String r2 = r6.getAttribute(r0)
            if (r2 != 0) goto L48
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r2 = r2[r1]
            java.nio.ByteOrder r5 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r3, r5)
            r2.put(r0, r5)
        L48:
            java.lang.String r0 = "Orientation"
            java.lang.String r2 = r6.getAttribute(r0)
            if (r2 != 0) goto L5d
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r1 = r2[r1]
            java.nio.ByteOrder r2 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r3, r2)
            r1.put(r0, r2)
        L5d:
            java.lang.String r0 = "LightSource"
            java.lang.String r1 = r6.getAttribute(r0)
            if (r1 != 0) goto L73
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r6.mAttributes
            r2 = 1
            r1 = r1[r2]
            java.nio.ByteOrder r2 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r3, r2)
            r1.put(r0, r2)
        L73:
            return
    }

    private static java.lang.String byteArrayToHexString(byte[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.length
            int r1 = r1 * 2
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        La:
            int r3 = r5.length
            if (r2 >= r3) goto L24
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r5[r2]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r3[r1] = r4
            java.lang.String r4 = "%02x"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L24:
            java.lang.String r5 = r0.toString()
            return r5
    }

    private static void closeFileDescriptor(java.io.FileDescriptor r1) {
            android.system.Os.close(r1)     // Catch: java.lang.Exception -> L4
            goto Lb
        L4:
            java.lang.String r1 = "ExifInterface"
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        Lb:
            return
    }

    private static void closeQuietly(java.io.Closeable r0) {
            if (r0 == 0) goto L8
            r0.close()     // Catch: java.lang.RuntimeException -> L6 java.lang.Exception -> L8
            goto L8
        L6:
            r0 = move-exception
            throw r0
        L8:
            return
    }

    private java.lang.String convertDecimalDegree(double r9) {
            r8 = this;
            long r0 = (long) r9
            double r2 = (double) r0
            double r9 = r9 - r2
            r2 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r4 = r9 * r2
            long r4 = (long) r4
            double r6 = (double) r4
            double r6 = r6 / r2
            double r9 = r9 - r6
            r2 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            double r9 = r9 * r2
            r2 = 4711630319722168320(0x416312d000000000, double:1.0E7)
            double r9 = r9 * r2
            long r9 = java.lang.Math.round(r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "/1,"
            r2.append(r0)
            r2.append(r4)
            r2.append(r0)
            r2.append(r9)
            java.lang.String r9 = "/10000000"
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            return r9
    }

    private static double convertRationalLatLonToDouble(java.lang.String r11, java.lang.String r12) {
            java.lang.String r0 = "/"
            java.lang.String r1 = ","
            r2 = -1
            java.lang.String[] r11 = r11.split(r1, r2)     // Catch: java.lang.Throwable -> L93
            r1 = 0
            r3 = r11[r1]     // Catch: java.lang.Throwable -> L93
            java.lang.String[] r3 = r3.split(r0, r2)     // Catch: java.lang.Throwable -> L93
            r4 = r3[r1]     // Catch: java.lang.Throwable -> L93
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L93
            double r4 = java.lang.Double.parseDouble(r4)     // Catch: java.lang.Throwable -> L93
            r6 = 1
            r3 = r3[r6]     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L93
            double r7 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.Throwable -> L93
            double r4 = r4 / r7
            r3 = r11[r6]     // Catch: java.lang.Throwable -> L93
            java.lang.String[] r3 = r3.split(r0, r2)     // Catch: java.lang.Throwable -> L93
            r7 = r3[r1]     // Catch: java.lang.Throwable -> L93
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L93
            double r7 = java.lang.Double.parseDouble(r7)     // Catch: java.lang.Throwable -> L93
            r3 = r3[r6]     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L93
            double r9 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.Throwable -> L93
            double r7 = r7 / r9
            r3 = 2
            r11 = r11[r3]     // Catch: java.lang.Throwable -> L93
            java.lang.String[] r11 = r11.split(r0, r2)     // Catch: java.lang.Throwable -> L93
            r0 = r11[r1]     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L93
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.Throwable -> L93
            r11 = r11[r6]     // Catch: java.lang.Throwable -> L93
            java.lang.String r11 = r11.trim()     // Catch: java.lang.Throwable -> L93
            double r2 = java.lang.Double.parseDouble(r11)     // Catch: java.lang.Throwable -> L93
            double r0 = r0 / r2
            r2 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r7 = r7 / r2
            double r7 = r7 + r4
            r2 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            double r0 = r0 / r2
            double r0 = r0 + r7
            java.lang.String r11 = "S"
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L93
            if (r11 != 0) goto L91
            java.lang.String r11 = "W"
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L93
            if (r11 == 0) goto L79
            goto L91
        L79:
            java.lang.String r11 = "N"
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L93
            if (r11 != 0) goto L90
            java.lang.String r11 = "E"
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L93
            if (r11 == 0) goto L8a
            goto L90
        L8a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L93
            r11.<init>()     // Catch: java.lang.Throwable -> L93
            throw r11     // Catch: java.lang.Throwable -> L93
        L90:
            return r0
        L91:
            double r11 = -r0
            return r11
        L93:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
    }

    private static long[] convertToLongArray(java.lang.Object r4) {
            boolean r0 = r4 instanceof int[]
            if (r0 == 0) goto L16
            int[] r4 = (int[]) r4
            int r0 = r4.length
            long[] r0 = new long[r0]
            r1 = 0
        La:
            int r2 = r4.length
            if (r1 >= r2) goto L15
            r2 = r4[r1]
            long r2 = (long) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto La
        L15:
            return r0
        L16:
            boolean r0 = r4 instanceof long[]
            if (r0 == 0) goto L1d
            long[] r4 = (long[]) r4
            return r4
        L1d:
            r4 = 0
            return r4
    }

    private static int copy(java.io.InputStream r5, java.io.OutputStream r6) throws java.io.IOException {
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = 0
        L6:
            int r3 = r5.read(r0)
            r4 = -1
            if (r3 == r4) goto L12
            int r2 = r2 + r3
            r6.write(r0, r1, r3)
            goto L6
        L12:
            return r2
    }

    private static void copy(java.io.InputStream r5, java.io.OutputStream r6, int r7) throws java.io.IOException {
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r0]
        L4:
            if (r7 <= 0) goto L1e
            int r2 = java.lang.Math.min(r7, r0)
            r3 = 0
            int r4 = r5.read(r1, r3, r2)
            if (r4 != r2) goto L16
            int r7 = r7 - r4
            r6.write(r1, r3, r4)
            goto L4
        L16:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "Failed to copy the given amount of bytes from the inputstream to the output stream."
            r5.<init>(r6)
            throw r5
        L1e:
            return
    }

    private void copyChunksUpToGivenChunkType(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r4, androidx.exifinterface.media.ExifInterface.ByteOrderedDataOutputStream r5, byte[] r6, byte[] r7) throws java.io.IOException {
            r3 = this;
        L0:
            r0 = 4
            byte[] r1 = new byte[r0]
            int r2 = r4.read(r1)
            if (r2 == r0) goto L3d
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Encountered invalid length while copying WebP chunks up tochunk type "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = androidx.exifinterface.media.ExifInterface.ASCII
            r0.<init>(r6, r1)
            r5.append(r0)
            if (r7 != 0) goto L20
            java.lang.String r6 = ""
            goto L32
        L20:
            java.lang.String r6 = " or "
            java.lang.StringBuilder r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7, r1)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
        L32:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L3d:
            r3.copyWebPChunk(r4, r5, r1)
            boolean r0 = java.util.Arrays.equals(r1, r6)
            if (r0 != 0) goto L4e
            if (r7 == 0) goto L0
            boolean r0 = java.util.Arrays.equals(r1, r7)
            if (r0 == 0) goto L0
        L4e:
            return
    }

    private void copyWebPChunk(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r3, androidx.exifinterface.media.ExifInterface.ByteOrderedDataOutputStream r4, byte[] r5) throws java.io.IOException {
            r2 = this;
            int r0 = r3.readInt()
            r4.write(r5)
            r4.writeInt(r0)
            int r5 = r0 % 2
            r1 = 1
            if (r5 != r1) goto L11
            int r0 = r0 + 1
        L11:
            copy(r3, r4, r0)
            return
    }

    @androidx.annotation.Nullable
    private androidx.exifinterface.media.ExifInterface.ExifAttribute getExifAttribute(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "tag shouldn't be null"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = "ISOSpeedRatings"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1b
            boolean r3 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r3 == 0) goto L19
            java.lang.String r3 = "ExifInterface"
            java.lang.String r0 = "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."
            android.util.Log.d(r3, r0)
        L19:
            java.lang.String r3 = "PhotographicSensitivity"
        L1b:
            r0 = 0
        L1c:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r1 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r1.length
            if (r0 >= r1) goto L31
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r2.mAttributes
            r1 = r1[r0]
            java.lang.Object r1 = r1.get(r3)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            if (r1 == 0) goto L2e
            return r1
        L2e:
            int r0 = r0 + 1
            goto L1c
        L31:
            r3 = 0
            return r3
    }

    private void getHeifAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r13) throws java.io.IOException {
            r12 = this;
            java.lang.String r0 = "yes"
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L14e
            r3 = 23
            if (r2 < r3) goto L17
            androidx.exifinterface.media.ExifInterface$1 r2 = new androidx.exifinterface.media.ExifInterface$1     // Catch: java.lang.Throwable -> L14e
            r2.<init>(r13)     // Catch: java.lang.Throwable -> L14e
            r1.setDataSource(r2)     // Catch: java.lang.Throwable -> L14e
            goto L26
        L17:
            java.io.FileDescriptor r2 = r12.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> L14e
            if (r2 == 0) goto L1f
            r1.setDataSource(r2)     // Catch: java.lang.Throwable -> L14e
            goto L26
        L1f:
            java.lang.String r2 = r12.mFilename     // Catch: java.lang.Throwable -> L14e
            if (r2 == 0) goto L14a
            r1.setDataSource(r2)     // Catch: java.lang.Throwable -> L14e
        L26:
            r2 = 33
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch: java.lang.Throwable -> L14e
            r3 = 34
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch: java.lang.Throwable -> L14e
            r4 = 26
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch: java.lang.Throwable -> L14e
            r5 = 17
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch: java.lang.Throwable -> L14e
            boolean r4 = r0.equals(r4)     // Catch: java.lang.Throwable -> L14e
            r6 = 0
            if (r4 == 0) goto L58
            r0 = 29
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch: java.lang.Throwable -> L14e
            r0 = 30
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch: java.lang.Throwable -> L14e
            r4 = 31
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch: java.lang.Throwable -> L14e
            goto L73
        L58:
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L14e
            if (r0 == 0) goto L71
            r0 = 18
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch: java.lang.Throwable -> L14e
            r0 = 19
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch: java.lang.Throwable -> L14e
            r4 = 24
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch: java.lang.Throwable -> L14e
            goto L73
        L71:
            r0 = r6
            r4 = r0
        L73:
            r5 = 0
            if (r6 == 0) goto L89
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r12.mAttributes     // Catch: java.lang.Throwable -> L14e
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L14e
            java.lang.String r8 = "ImageWidth"
            int r9 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> L14e
            java.nio.ByteOrder r10 = r12.mExifByteOrder     // Catch: java.lang.Throwable -> L14e
            androidx.exifinterface.media.ExifInterface$ExifAttribute r9 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r9, r10)     // Catch: java.lang.Throwable -> L14e
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L14e
        L89:
            if (r0 == 0) goto L9e
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r12.mAttributes     // Catch: java.lang.Throwable -> L14e
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L14e
            java.lang.String r8 = "ImageLength"
            int r9 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L14e
            java.nio.ByteOrder r10 = r12.mExifByteOrder     // Catch: java.lang.Throwable -> L14e
            androidx.exifinterface.media.ExifInterface$ExifAttribute r9 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r9, r10)     // Catch: java.lang.Throwable -> L14e
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L14e
        L9e:
            r7 = 6
            if (r4 == 0) goto Lc8
            r8 = 1
            int r9 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L14e
            r10 = 90
            if (r9 == r10) goto Lb8
            r10 = 180(0xb4, float:2.52E-43)
            if (r9 == r10) goto Lb6
            r10 = 270(0x10e, float:3.78E-43)
            if (r9 == r10) goto Lb3
            goto Lb9
        Lb3:
            r8 = 8
            goto Lb9
        Lb6:
            r8 = 3
            goto Lb9
        Lb8:
            r8 = 6
        Lb9:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r12.mAttributes     // Catch: java.lang.Throwable -> L14e
            r9 = r9[r5]     // Catch: java.lang.Throwable -> L14e
            java.lang.String r10 = "Orientation"
            java.nio.ByteOrder r11 = r12.mExifByteOrder     // Catch: java.lang.Throwable -> L14e
            androidx.exifinterface.media.ExifInterface$ExifAttribute r8 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r8, r11)     // Catch: java.lang.Throwable -> L14e
            r9.put(r10, r8)     // Catch: java.lang.Throwable -> L14e
        Lc8:
            if (r2 == 0) goto L11b
            if (r3 == 0) goto L11b
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L14e
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L14e
            if (r3 <= r7) goto L113
            long r8 = (long) r2     // Catch: java.lang.Throwable -> L14e
            r13.seek(r8)     // Catch: java.lang.Throwable -> L14e
            byte[] r8 = new byte[r7]     // Catch: java.lang.Throwable -> L14e
            int r9 = r13.read(r8)     // Catch: java.lang.Throwable -> L14e
            if (r9 != r7) goto L10b
            int r2 = r2 + r7
            int r3 = r3 + (-6)
            byte[] r7 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1     // Catch: java.lang.Throwable -> L14e
            boolean r7 = java.util.Arrays.equals(r8, r7)     // Catch: java.lang.Throwable -> L14e
            if (r7 == 0) goto L103
            byte[] r7 = new byte[r3]     // Catch: java.lang.Throwable -> L14e
            int r13 = r13.read(r7)     // Catch: java.lang.Throwable -> L14e
            if (r13 != r3) goto Lfb
            r12.mExifOffset = r2     // Catch: java.lang.Throwable -> L14e
            r12.readExifSegment(r7, r5)     // Catch: java.lang.Throwable -> L14e
            goto L11b
        Lfb:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L14e
            java.lang.String r0 = "Can't read exif"
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L14e
            throw r13     // Catch: java.lang.Throwable -> L14e
        L103:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L14e
            java.lang.String r0 = "Invalid identifier"
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L14e
            throw r13     // Catch: java.lang.Throwable -> L14e
        L10b:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L14e
            java.lang.String r0 = "Can't read identifier"
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L14e
            throw r13     // Catch: java.lang.Throwable -> L14e
        L113:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L14e
            java.lang.String r0 = "Invalid exif length"
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L14e
            throw r13     // Catch: java.lang.Throwable -> L14e
        L11b:
            boolean r13 = androidx.exifinterface.media.ExifInterface.DEBUG     // Catch: java.lang.Throwable -> L14e
            if (r13 == 0) goto L146
            java.lang.String r13 = "ExifInterface"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14e
            r2.<init>()     // Catch: java.lang.Throwable -> L14e
            java.lang.String r3 = "Heif meta: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L14e
            r2.append(r6)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r3 = "x"
            r2.append(r3)     // Catch: java.lang.Throwable -> L14e
            r2.append(r0)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r0 = ", rotation "
            r2.append(r0)     // Catch: java.lang.Throwable -> L14e
            r2.append(r4)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L14e
            android.util.Log.d(r13, r0)     // Catch: java.lang.Throwable -> L14e
        L146:
            r1.release()
            return
        L14a:
            r1.release()
            return
        L14e:
            r13 = move-exception
            r1.release()
            throw r13
    }

    private void getJpegAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r18, int r19, int r20) throws java.io.IOException {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r4 = androidx.exifinterface.media.ExifInterface.DEBUG
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L22
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "getJpegAttributes starting with: "
            r4.append(r6)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L22:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            r1.setByteOrder(r4)
            long r6 = (long) r2
            r1.seek(r6)
            byte r4 = r18.readByte()
            java.lang.String r6 = "Invalid marker: "
            r7 = -1
            if (r4 != r7) goto L1be
            r8 = 1
            int r2 = r2 + r8
            byte r9 = r18.readByte()
            r10 = -40
            if (r9 != r10) goto L1a7
            int r2 = r2 + r8
        L3f:
            byte r4 = r18.readByte()
            if (r4 != r7) goto L18e
            int r2 = r2 + r8
            byte r4 = r18.readByte()
            boolean r6 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r6 == 0) goto L64
            java.lang.String r7 = "Found JPEG segment indicator: "
            java.lang.StringBuilder r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7)
            r9 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r5, r7)
        L64:
            int r2 = r2 + r8
            r7 = -39
            if (r4 == r7) goto L188
            r7 = -38
            if (r4 != r7) goto L6f
            goto L188
        L6f:
            int r7 = r18.readUnsignedShort()
            int r7 = r7 + (-2)
            int r2 = r2 + 2
            if (r6 == 0) goto L9e
            java.lang.String r6 = "JPEG segment: "
            java.lang.StringBuilder r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            r9 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r6.append(r9)
            java.lang.String r9 = " (length: "
            r6.append(r9)
            int r9 = r7 + 2
            r6.append(r9)
            java.lang.String r9 = ")"
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L9e:
            java.lang.String r6 = "Invalid length"
            if (r7 < 0) goto L182
            r9 = -31
            r10 = 0
            if (r4 == r9) goto L11d
            r9 = -2
            if (r4 == r9) goto Lf2
            switch(r4) {
                case -64: goto Lb8;
                case -63: goto Lb8;
                case -62: goto Lb8;
                case -61: goto Lb8;
                default: goto Lad;
            }
        Lad:
            switch(r4) {
                case -59: goto Lb8;
                case -58: goto Lb8;
                case -57: goto Lb8;
                default: goto Lb0;
            }
        Lb0:
            switch(r4) {
                case -55: goto Lb8;
                case -54: goto Lb8;
                case -53: goto Lb8;
                default: goto Lb3;
            }
        Lb3:
            switch(r4) {
                case -51: goto Lb8;
                case -50: goto Lb8;
                case -49: goto Lb8;
                default: goto Lb6;
            }
        Lb6:
            goto L167
        Lb8:
            int r4 = r1.skipBytes(r8)
            if (r4 != r8) goto Lea
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r3]
            int r8 = r18.readUnsignedShort()
            long r8 = (long) r8
            java.nio.ByteOrder r10 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r8 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r8, r10)
            java.lang.String r9 = "ImageLength"
            r4.put(r9, r8)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r3]
            int r8 = r18.readUnsignedShort()
            long r8 = (long) r8
            java.nio.ByteOrder r10 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r8 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r8, r10)
            java.lang.String r9 = "ImageWidth"
            r4.put(r9, r8)
            int r7 = r7 + (-5)
            goto L167
        Lea:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid SOFx"
            r1.<init>(r2)
            throw r1
        Lf2:
            byte[] r4 = new byte[r7]
            int r9 = r1.read(r4)
            if (r9 != r7) goto L115
            java.lang.String r7 = "UserComment"
            java.lang.String r9 = r0.getAttribute(r7)
            if (r9 != 0) goto L166
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.mAttributes
            r8 = r9[r8]
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = androidx.exifinterface.media.ExifInterface.ASCII
            r9.<init>(r4, r10)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createString(r9)
            r8.put(r7, r4)
            goto L166
        L115:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L11d:
            byte[] r4 = new byte[r7]
            r1.readFully(r4)
            int r8 = r2 + r7
            byte[] r9 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            boolean r11 = startsWith(r4, r9)
            if (r11 == 0) goto L139
            int r10 = r9.length
            int r2 = r2 + r10
            int r9 = r9.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r9, r7)
            r0.mExifOffset = r2
            r0.readExifSegment(r4, r3)
            goto L165
        L139:
            byte[] r9 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_XMP_APP1
            boolean r11 = startsWith(r4, r9)
            if (r11 == 0) goto L165
            int r11 = r9.length
            int r2 = r2 + r11
            int r9 = r9.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r9, r7)
            java.lang.String r7 = "Xmp"
            java.lang.String r9 = r0.getAttribute(r7)
            if (r9 != 0) goto L165
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.mAttributes
            r9 = r9[r10]
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
            r12 = 1
            int r13 = r4.length
            long r14 = (long) r2
            r11 = r10
            r16 = r4
            r11.<init>(r12, r13, r14, r16)
            r9.put(r7, r10)
            r2 = 1
            r0.mXmpIsFromSeparateMarker = r2
        L165:
            r2 = r8
        L166:
            r7 = 0
        L167:
            if (r7 < 0) goto L17c
            int r4 = r1.skipBytes(r7)
            if (r4 != r7) goto L174
            int r2 = r2 + r7
            r7 = -1
            r8 = 1
            goto L3f
        L174:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid JPEG segment"
            r1.<init>(r2)
            throw r1
        L17c:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r6)
            throw r1
        L182:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r6)
            throw r1
        L188:
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            r1.setByteOrder(r2)
            return
        L18e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid marker:"
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1a7:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1be:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private int getMimeType(java.io.BufferedInputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = 5000(0x1388, float:7.006E-42)
            r2.mark(r0)
            byte[] r0 = new byte[r0]
            r2.read(r0)
            r2.reset()
            boolean r2 = isJpegFormat(r0)
            if (r2 == 0) goto L15
            r2 = 4
            return r2
        L15:
            boolean r2 = r1.isRafFormat(r0)
            if (r2 == 0) goto L1e
            r2 = 9
            return r2
        L1e:
            boolean r2 = r1.isHeifFormat(r0)
            if (r2 == 0) goto L27
            r2 = 12
            return r2
        L27:
            boolean r2 = r1.isOrfFormat(r0)
            if (r2 == 0) goto L2f
            r2 = 7
            return r2
        L2f:
            boolean r2 = r1.isRw2Format(r0)
            if (r2 == 0) goto L38
            r2 = 10
            return r2
        L38:
            boolean r2 = r1.isPngFormat(r0)
            if (r2 == 0) goto L41
            r2 = 13
            return r2
        L41:
            boolean r2 = r1.isWebpFormat(r0)
            if (r2 == 0) goto L4a
            r2 = 14
            return r2
        L4a:
            r2 = 0
            return r2
    }

    private void getOrfAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r7) throws java.io.IOException {
            r6 = this;
            r6.getRawAttributes(r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.mAttributes
            r0 = 1
            r7 = r7[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r7 = r7.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r7
            if (r7 == 0) goto Lf3
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r1 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            byte[] r7 = r7.bytes
            r1.<init>(r7)
            java.nio.ByteOrder r7 = r6.mExifByteOrder
            r1.setByteOrder(r7)
            byte[] r7 = androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_HEADER_1
            int r2 = r7.length
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            r3 = 0
            r1.seek(r3)
            byte[] r3 = androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_HEADER_2
            int r4 = r3.length
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            boolean r7 = java.util.Arrays.equals(r2, r7)
            if (r7 == 0) goto L3f
            r2 = 8
            r1.seek(r2)
            goto L4a
        L3f:
            boolean r7 = java.util.Arrays.equals(r4, r3)
            if (r7 == 0) goto L4a
            r2 = 12
            r1.seek(r2)
        L4a:
            r7 = 6
            r6.readImageFileDirectory(r1, r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.mAttributes
            r1 = 7
            r7 = r7[r1]
            java.lang.String r2 = "PreviewImageStart"
            java.lang.Object r7 = r7.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r7
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r1 = r2[r1]
            java.lang.String r2 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            if (r7 == 0) goto L7e
            if (r1 == 0) goto L7e
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r3 = 5
            r2 = r2[r3]
            java.lang.String r4 = "JPEGInterchangeFormat"
            r2.put(r4, r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.mAttributes
            r7 = r7[r3]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r7.put(r2, r1)
        L7e:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.mAttributes
            r1 = 8
            r7 = r7[r1]
            java.lang.String r1 = "AspectFrame"
            java.lang.Object r7 = r7.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r7
            if (r7 == 0) goto Lf3
            java.nio.ByteOrder r1 = r6.mExifByteOrder
            java.lang.Object r7 = r7.getValue(r1)
            int[] r7 = (int[]) r7
            if (r7 == 0) goto Ldd
            int r1 = r7.length
            r2 = 4
            if (r1 == r2) goto L9d
            goto Ldd
        L9d:
            r1 = 2
            r2 = r7[r1]
            r3 = 0
            r4 = r7[r3]
            if (r2 <= r4) goto Lf3
            r2 = 3
            r4 = r7[r2]
            r5 = r7[r0]
            if (r4 <= r5) goto Lf3
            r1 = r7[r1]
            r4 = r7[r3]
            int r1 = r1 - r4
            int r1 = r1 + r0
            r2 = r7[r2]
            r7 = r7[r0]
            int r2 = r2 - r7
            int r2 = r2 + r0
            if (r1 >= r2) goto Lbe
            int r1 = r1 + r2
            int r2 = r1 - r2
            int r1 = r1 - r2
        Lbe:
            java.nio.ByteOrder r7 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r1, r7)
            java.nio.ByteOrder r0 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r2, r0)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r6.mAttributes
            r1 = r1[r3]
            java.lang.String r2 = "ImageWidth"
            r1.put(r2, r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.mAttributes
            r7 = r7[r3]
            java.lang.String r1 = "ImageLength"
            r7.put(r1, r0)
            goto Lf3
        Ldd:
            java.lang.String r0 = "Invalid aspect frame values. frame="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r7)
        Lf3:
            return
    }

    private void getPngAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r7) throws java.io.IOException {
            r6 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getPngAttributes starting with: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L1a:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r7.setByteOrder(r0)
            byte[] r0 = androidx.exifinterface.media.ExifInterface.PNG_SIGNATURE
            int r1 = r0.length
            r7.skipBytes(r1)
            int r0 = r0.length
            r1 = 0
            int r0 = r0 + r1
        L28:
            int r2 = r7.readInt()     // Catch: java.io.EOFException -> Ld2
            r3 = 4
            int r0 = r0 + r3
            byte[] r4 = new byte[r3]     // Catch: java.io.EOFException -> Ld2
            int r5 = r7.read(r4)     // Catch: java.io.EOFException -> Ld2
            if (r5 != r3) goto Lca
            int r0 = r0 + r3
            r3 = 16
            if (r0 != r3) goto L4c
            byte[] r3 = androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_IHDR     // Catch: java.io.EOFException -> Ld2
            boolean r3 = java.util.Arrays.equals(r4, r3)     // Catch: java.io.EOFException -> Ld2
            if (r3 == 0) goto L44
            goto L4c
        L44:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.io.EOFException -> Ld2
            java.lang.String r0 = "Encountered invalid PNG file--IHDR chunk should appearas the first chunk"
            r7.<init>(r0)     // Catch: java.io.EOFException -> Ld2
            throw r7     // Catch: java.io.EOFException -> Ld2
        L4c:
            byte[] r3 = androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_IEND     // Catch: java.io.EOFException -> Ld2
            boolean r3 = java.util.Arrays.equals(r4, r3)     // Catch: java.io.EOFException -> Ld2
            if (r3 == 0) goto L55
            goto L83
        L55:
            byte[] r3 = androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_EXIF     // Catch: java.io.EOFException -> Ld2
            boolean r3 = java.util.Arrays.equals(r4, r3)     // Catch: java.io.EOFException -> Ld2
            if (r3 == 0) goto Lc2
            byte[] r3 = new byte[r2]     // Catch: java.io.EOFException -> Ld2
            int r5 = r7.read(r3)     // Catch: java.io.EOFException -> Ld2
            if (r5 != r2) goto La7
            int r7 = r7.readInt()     // Catch: java.io.EOFException -> Ld2
            java.util.zip.CRC32 r2 = new java.util.zip.CRC32     // Catch: java.io.EOFException -> Ld2
            r2.<init>()     // Catch: java.io.EOFException -> Ld2
            r2.update(r4)     // Catch: java.io.EOFException -> Ld2
            r2.update(r3)     // Catch: java.io.EOFException -> Ld2
            long r4 = r2.getValue()     // Catch: java.io.EOFException -> Ld2
            int r5 = (int) r4     // Catch: java.io.EOFException -> Ld2
            if (r5 != r7) goto L84
            r6.mExifOffset = r0     // Catch: java.io.EOFException -> Ld2
            r6.readExifSegment(r3, r1)     // Catch: java.io.EOFException -> Ld2
            r6.validateImages()     // Catch: java.io.EOFException -> Ld2
        L83:
            return
        L84:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.io.EOFException -> Ld2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Ld2
            r1.<init>()     // Catch: java.io.EOFException -> Ld2
            java.lang.String r3 = "Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: "
            r1.append(r3)     // Catch: java.io.EOFException -> Ld2
            r1.append(r7)     // Catch: java.io.EOFException -> Ld2
            java.lang.String r7 = ", calculated CRC value: "
            r1.append(r7)     // Catch: java.io.EOFException -> Ld2
            long r2 = r2.getValue()     // Catch: java.io.EOFException -> Ld2
            r1.append(r2)     // Catch: java.io.EOFException -> Ld2
            java.lang.String r7 = r1.toString()     // Catch: java.io.EOFException -> Ld2
            r0.<init>(r7)     // Catch: java.io.EOFException -> Ld2
            throw r0     // Catch: java.io.EOFException -> Ld2
        La7:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.io.EOFException -> Ld2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Ld2
            r0.<init>()     // Catch: java.io.EOFException -> Ld2
            java.lang.String r1 = "Failed to read given length for given PNG chunk type: "
            r0.append(r1)     // Catch: java.io.EOFException -> Ld2
            java.lang.String r1 = byteArrayToHexString(r4)     // Catch: java.io.EOFException -> Ld2
            r0.append(r1)     // Catch: java.io.EOFException -> Ld2
            java.lang.String r0 = r0.toString()     // Catch: java.io.EOFException -> Ld2
            r7.<init>(r0)     // Catch: java.io.EOFException -> Ld2
            throw r7     // Catch: java.io.EOFException -> Ld2
        Lc2:
            int r2 = r2 + 4
            r7.skipBytes(r2)     // Catch: java.io.EOFException -> Ld2
            int r0 = r0 + r2
            goto L28
        Lca:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.io.EOFException -> Ld2
            java.lang.String r0 = "Encountered invalid length while parsing PNG chunktype"
            r7.<init>(r0)     // Catch: java.io.EOFException -> Ld2
            throw r7     // Catch: java.io.EOFException -> Ld2
        Ld2:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "Encountered corrupt PNG file."
            r7.<init>(r0)
            throw r7
    }

    private void getRafAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r8) throws java.io.IOException {
            r7 = this;
            r0 = 84
            r8.skipBytes(r0)
            r0 = 4
            byte[] r1 = new byte[r0]
            byte[] r2 = new byte[r0]
            r8.read(r1)
            r8.skipBytes(r0)
            r8.read(r2)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r1)
            int r0 = r0.getInt()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r2)
            int r1 = r1.getInt()
            r2 = 5
            r7.getJpegAttributes(r8, r0, r2)
            long r0 = (long) r1
            r8.seek(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r8.setByteOrder(r0)
            int r0 = r8.readInt()
            boolean r1 = androidx.exifinterface.media.ExifInterface.DEBUG
            java.lang.String r2 = "ExifInterface"
            if (r1 == 0) goto L4e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "numberOfDirectoryEntry: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L4e:
            r1 = 0
            r3 = 0
        L50:
            if (r3 >= r0) goto Lad
            int r4 = r8.readUnsignedShort()
            int r5 = r8.readUnsignedShort()
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = androidx.exifinterface.media.ExifInterface.TAG_RAF_IMAGE_SIZE
            int r6 = r6.number
            if (r4 != r6) goto La7
            short r0 = r8.readShort()
            short r8 = r8.readShort()
            java.nio.ByteOrder r3 = r7.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r0, r3)
            java.nio.ByteOrder r4 = r7.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r8, r4)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r7.mAttributes
            r5 = r5[r1]
            java.lang.String r6 = "ImageLength"
            r5.put(r6, r3)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r7.mAttributes
            r1 = r3[r1]
            java.lang.String r3 = "ImageWidth"
            r1.put(r3, r4)
            boolean r1 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r1 == 0) goto La6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Updated to length: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = ", width: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            android.util.Log.d(r2, r8)
        La6:
            return
        La7:
            r8.skipBytes(r5)
            int r3 = r3 + 1
            goto L50
        Lad:
            return
    }

    private void getRawAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r5) throws java.io.IOException {
            r4 = this;
            int r0 = r5.available()
            r4.parseTiffHeaders(r5, r0)
            r0 = 0
            r4.readImageFileDirectory(r5, r0)
            r4.updateImageSizeValues(r5, r0)
            r0 = 5
            r4.updateImageSizeValues(r5, r0)
            r0 = 4
            r4.updateImageSizeValues(r5, r0)
            r4.validateImages()
            int r5 = r4.mMimeType
            r0 = 8
            if (r5 != r0) goto L59
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r4.mAttributes
            r0 = 1
            r5 = r5[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r5 = r5.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r5
            if (r5 == 0) goto L59
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r1 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            byte[] r5 = r5.bytes
            r1.<init>(r5)
            java.nio.ByteOrder r5 = r4.mExifByteOrder
            r1.setByteOrder(r5)
            r2 = 6
            r1.seek(r2)
            r5 = 9
            r4.readImageFileDirectory(r1, r5)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r4.mAttributes
            r5 = r1[r5]
            java.lang.String r1 = "ColorSpace"
            java.lang.Object r5 = r5.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r5
            if (r5 == 0) goto L59
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r4.mAttributes
            r0 = r2[r0]
            r0.put(r1, r5)
        L59:
            return
    }

    private void getRw2Attributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r4) throws java.io.IOException {
            r3 = this;
            r3.getRawAttributes(r4)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r3.mAttributes
            r1 = 0
            r0 = r0[r1]
            java.lang.String r2 = "JpgFromRaw"
            java.lang.Object r0 = r0.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            if (r0 == 0) goto L18
            int r0 = r3.mRw2JpgFromRawOffset
            r2 = 5
            r3.getJpegAttributes(r4, r0, r2)
        L18:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r3.mAttributes
            r4 = r4[r1]
            java.lang.String r0 = "ISO"
            java.lang.Object r4 = r4.get(r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r3.mAttributes
            r1 = 1
            r0 = r0[r1]
            java.lang.String r2 = "PhotographicSensitivity"
            java.lang.Object r0 = r0.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            if (r4 == 0) goto L3c
            if (r0 != 0) goto L3c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r3.mAttributes
            r0 = r0[r1]
            r0.put(r2, r4)
        L3c:
            return
    }

    private void getStandaloneAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r3) throws java.io.IOException {
            r2 = this;
            byte[] r0 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            int r1 = r0.length
            r3.skipBytes(r1)
            int r1 = r3.available()
            byte[] r1 = new byte[r1]
            r3.readFully(r1)
            int r3 = r0.length
            r2.mExifOffset = r3
            r3 = 0
            r2.readExifSegment(r1, r3)
            return
    }

    private void getWebpAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getWebpAttributes starting with: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L1a:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r6.setByteOrder(r0)
            byte[] r0 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_1
            int r0 = r0.length
            r6.skipBytes(r0)
            int r0 = r6.readInt()
            int r0 = r0 + 8
            byte[] r1 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_2
            int r1 = r1.length
            int r1 = r6.skipBytes(r1)
            int r1 = r1 + 8
        L34:
            r2 = 4
            byte[] r3 = new byte[r2]     // Catch: java.io.EOFException -> La3
            int r4 = r6.read(r3)     // Catch: java.io.EOFException -> La3
            if (r4 != r2) goto L9b
            int r1 = r1 + r2
            int r4 = r6.readInt()     // Catch: java.io.EOFException -> La3
            int r1 = r1 + r2
            byte[] r2 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_EXIF     // Catch: java.io.EOFException -> La3
            boolean r2 = java.util.Arrays.equals(r2, r3)     // Catch: java.io.EOFException -> La3
            if (r2 == 0) goto L77
            byte[] r0 = new byte[r4]     // Catch: java.io.EOFException -> La3
            int r6 = r6.read(r0)     // Catch: java.io.EOFException -> La3
            if (r6 != r4) goto L5c
            r5.mExifOffset = r1     // Catch: java.io.EOFException -> La3
            r6 = 0
            r5.readExifSegment(r0, r6)     // Catch: java.io.EOFException -> La3
            r5.mExifOffset = r1     // Catch: java.io.EOFException -> La3
            goto L82
        L5c:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.io.EOFException -> La3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> La3
            r0.<init>()     // Catch: java.io.EOFException -> La3
            java.lang.String r1 = "Failed to read given length for given PNG chunk type: "
            r0.append(r1)     // Catch: java.io.EOFException -> La3
            java.lang.String r1 = byteArrayToHexString(r3)     // Catch: java.io.EOFException -> La3
            r0.append(r1)     // Catch: java.io.EOFException -> La3
            java.lang.String r0 = r0.toString()     // Catch: java.io.EOFException -> La3
            r6.<init>(r0)     // Catch: java.io.EOFException -> La3
            throw r6     // Catch: java.io.EOFException -> La3
        L77:
            int r2 = r4 % 2
            r3 = 1
            if (r2 != r3) goto L7e
            int r4 = r4 + 1
        L7e:
            int r2 = r1 + r4
            if (r2 != r0) goto L83
        L82:
            return
        L83:
            java.lang.String r3 = "Encountered WebP file with invalid chunk size"
            if (r2 > r0) goto L95
            int r2 = r6.skipBytes(r4)     // Catch: java.io.EOFException -> La3
            if (r2 != r4) goto L8f
            int r1 = r1 + r2
            goto L34
        L8f:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.io.EOFException -> La3
            r6.<init>(r3)     // Catch: java.io.EOFException -> La3
            throw r6     // Catch: java.io.EOFException -> La3
        L95:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.io.EOFException -> La3
            r6.<init>(r3)     // Catch: java.io.EOFException -> La3
            throw r6     // Catch: java.io.EOFException -> La3
        L9b:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.io.EOFException -> La3
            java.lang.String r0 = "Encountered invalid length while parsing WebP chunktype"
            r6.<init>(r0)     // Catch: java.io.EOFException -> La3
            throw r6     // Catch: java.io.EOFException -> La3
        La3:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "Encountered corrupt WebP file."
            r6.<init>(r0)
            throw r6
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> guessDataFormat(java.lang.String r12) {
            java.lang.String r0 = ","
            boolean r1 = r12.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto La6
            java.lang.String[] r12 = r12.split(r0, r6)
            r0 = r12[r2]
            android.util.Pair r0 = guessDataFormat(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L29
            return r0
        L29:
            int r1 = r12.length
            if (r3 >= r1) goto La5
            r1 = r12[r3]
            android.util.Pair r1 = guessDataFormat(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L4d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L4b
            goto L4d
        L4b:
            r2 = -1
            goto L55
        L4d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L55:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L80
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L77
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L80
        L77:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L81
        L80:
            r1 = -1
        L81:
            if (r2 != r6) goto L8b
            if (r1 != r6) goto L8b
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L8b:
            if (r2 != r6) goto L97
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto La2
        L97:
            if (r1 != r6) goto La2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        La2:
            int r3 = r3 + 1
            goto L29
        La5:
            return r0
        La6:
            java.lang.String r0 = "/"
            boolean r1 = r12.contains(r0)
            r8 = 0
            if (r1 == 0) goto L105
            java.lang.String[] r12 = r12.split(r0, r6)
            int r0 = r12.length
            if (r0 != r4) goto Lff
            r0 = r12[r2]     // Catch: java.lang.NumberFormatException -> Lff
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> Lff
            long r0 = (long) r0     // Catch: java.lang.NumberFormatException -> Lff
            r12 = r12[r3]     // Catch: java.lang.NumberFormatException -> Lff
            double r2 = java.lang.Double.parseDouble(r12)     // Catch: java.lang.NumberFormatException -> Lff
            long r2 = (long) r2     // Catch: java.lang.NumberFormatException -> Lff
            r12 = 10
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto Lf5
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 >= 0) goto Ld0
            goto Lf5
        Ld0:
            r4 = 5
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 > 0) goto Leb
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto Ldd
            goto Leb
        Ldd:
            android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> Lff
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.NumberFormatException -> Lff
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> Lff
            r0.<init>(r12, r1)     // Catch: java.lang.NumberFormatException -> Lff
            return r0
        Leb:
            android.util.Pair r12 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> Lff
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> Lff
            r12.<init>(r0, r7)     // Catch: java.lang.NumberFormatException -> Lff
            return r12
        Lf5:
            android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> Lff
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.NumberFormatException -> Lff
            r0.<init>(r12, r7)     // Catch: java.lang.NumberFormatException -> Lff
            return r0
        Lff:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L105:
            long r0 = java.lang.Long.parseLong(r12)     // Catch: java.lang.NumberFormatException -> L14e
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L14e
            long r1 = r0.longValue()     // Catch: java.lang.NumberFormatException -> L14e
            r3 = 4
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 < 0) goto L130
            long r1 = r0.longValue()     // Catch: java.lang.NumberFormatException -> L14e
            r10 = 65535(0xffff, double:3.23786E-319)
            int r4 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r4 > 0) goto L130
            android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> L14e
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L14e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L14e
            r0.<init>(r1, r2)     // Catch: java.lang.NumberFormatException -> L14e
            return r0
        L130:
            long r0 = r0.longValue()     // Catch: java.lang.NumberFormatException -> L14e
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L144
            android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> L14e
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L14e
            r0.<init>(r1, r7)     // Catch: java.lang.NumberFormatException -> L14e
            return r0
        L144:
            android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> L14e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L14e
            r0.<init>(r1, r7)     // Catch: java.lang.NumberFormatException -> L14e
            return r0
        L14e:
            java.lang.Double.parseDouble(r12)     // Catch: java.lang.NumberFormatException -> L15d
            android.util.Pair r12 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> L15d
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L15d
            r12.<init>(r0, r7)     // Catch: java.lang.NumberFormatException -> L15d
            return r12
        L15d:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
    }

    private void handleThumbnailFromJfif(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r6, java.util.HashMap r7) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "JPEGInterchangeFormat"
            java.lang.Object r0 = r7.get(r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.lang.String r1 = "JPEGInterchangeFormatLength"
            java.lang.Object r7 = r7.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r7
            if (r0 == 0) goto L78
            if (r7 == 0) goto L78
            java.nio.ByteOrder r1 = r5.mExifByteOrder
            int r0 = r0.getIntValue(r1)
            java.nio.ByteOrder r1 = r5.mExifByteOrder
            int r7 = r7.getIntValue(r1)
            int r1 = r5.mMimeType
            r2 = 7
            if (r1 != r2) goto L28
            int r1 = r5.mOrfMakerNoteOffset
            int r0 = r0 + r1
        L28:
            int r1 = r6.getLength()
            int r1 = r1 - r0
            int r7 = java.lang.Math.min(r7, r1)
            if (r0 <= 0) goto L56
            if (r7 <= 0) goto L56
            r1 = 1
            r5.mHasThumbnail = r1
            int r1 = r5.mExifOffset
            int r1 = r1 + r0
            r5.mThumbnailOffset = r1
            r5.mThumbnailLength = r7
            java.lang.String r2 = r5.mFilename
            if (r2 != 0) goto L56
            android.content.res.AssetManager$AssetInputStream r2 = r5.mAssetInputStream
            if (r2 != 0) goto L56
            java.io.FileDescriptor r2 = r5.mSeekableFileDescriptor
            if (r2 != 0) goto L56
            byte[] r2 = new byte[r7]
            long r3 = (long) r1
            r6.seek(r3)
            r6.readFully(r2)
            r5.mThumbnailBytes = r2
        L56:
            boolean r6 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r6 == 0) goto L78
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Setting thumbnail attributes with offset: "
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = ", length: "
            r6.append(r0)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "ExifInterface"
            android.util.Log.d(r7, r6)
        L78:
            return
    }

    private void handleThumbnailFromStrips(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r20, java.util.HashMap r21) throws java.io.IOException {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.String r3 = "StripOffsets"
            java.lang.Object r3 = r2.get(r3)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            java.lang.String r4 = "StripByteCounts"
            java.lang.Object r2 = r2.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r2
            if (r3 == 0) goto Lb4
            if (r2 == 0) goto Lb4
            java.nio.ByteOrder r4 = r0.mExifByteOrder
            java.lang.Object r3 = r3.getValue(r4)
            long[] r3 = convertToLongArray(r3)
            java.nio.ByteOrder r4 = r0.mExifByteOrder
            java.lang.Object r2 = r2.getValue(r4)
            long[] r2 = convertToLongArray(r2)
            java.lang.String r4 = "ExifInterface"
            if (r3 == 0) goto Lae
            int r5 = r3.length
            if (r5 != 0) goto L37
            goto Lae
        L37:
            if (r2 == 0) goto La7
            int r5 = r2.length
            if (r5 != 0) goto L3d
            goto La7
        L3d:
            int r5 = r3.length
            int r6 = r2.length
            if (r5 == r6) goto L48
            java.lang.String r1 = "stripOffsets and stripByteCounts should have same length."
            android.util.Log.w(r4, r1)
            return
        L48:
            r5 = 0
            int r7 = r2.length
            r8 = 0
            r9 = 0
        L4d:
            if (r9 >= r7) goto L55
            r10 = r2[r9]
            long r5 = r5 + r10
            int r9 = r9 + 1
            goto L4d
        L55:
            int r6 = (int) r5
            byte[] r5 = new byte[r6]
            r7 = 1
            r0.mAreThumbnailStripsConsecutive = r7
            r0.mHasThumbnailStrips = r7
            r0.mHasThumbnail = r7
            r9 = 0
            r10 = 0
            r11 = 0
        L62:
            int r12 = r3.length
            if (r9 >= r12) goto L96
            r12 = r3[r9]
            int r13 = (int) r12
            r14 = r2[r9]
            int r12 = (int) r14
            int r14 = r3.length
            int r14 = r14 - r7
            if (r9 >= r14) goto L7c
            int r14 = r13 + r12
            long r14 = (long) r14
            int r16 = r9 + 1
            r16 = r3[r16]
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 == 0) goto L7c
            r0.mAreThumbnailStripsConsecutive = r8
        L7c:
            int r13 = r13 - r10
            if (r13 >= 0) goto L84
            java.lang.String r14 = "Invalid strip offset value"
            android.util.Log.d(r4, r14)
        L84:
            long r14 = (long) r13
            r1.seek(r14)
            int r10 = r10 + r13
            byte[] r13 = new byte[r12]
            r1.read(r13)
            int r10 = r10 + r12
            java.lang.System.arraycopy(r13, r8, r5, r11, r12)
            int r11 = r11 + r12
            int r9 = r9 + 1
            goto L62
        L96:
            r0.mThumbnailBytes = r5
            boolean r1 = r0.mAreThumbnailStripsConsecutive
            if (r1 == 0) goto Lb4
            r1 = r3[r8]
            int r2 = (int) r1
            int r1 = r0.mExifOffset
            int r2 = r2 + r1
            r0.mThumbnailOffset = r2
            r0.mThumbnailLength = r6
            goto Lb4
        La7:
            java.lang.String r1 = "stripByteCounts should not be null or have zero length."
            android.util.Log.w(r4, r1)
            return
        Lae:
            java.lang.String r1 = "stripOffsets should not be null or have zero length."
            android.util.Log.w(r4, r1)
        Lb4:
            return
    }

    private void initForFilename(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "filename cannot be null"
            java.util.Objects.requireNonNull(r3, r0)
            r0 = 0
            r2.mAssetInputStream = r0
            r2.mFilename = r3
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2c
            java.io.FileDescriptor r3 = r1.getFD()     // Catch: java.lang.Throwable -> L29
            boolean r3 = isSeekableFD(r3)     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L20
            java.io.FileDescriptor r3 = r1.getFD()     // Catch: java.lang.Throwable -> L29
            r2.mSeekableFileDescriptor = r3     // Catch: java.lang.Throwable -> L29
            goto L22
        L20:
            r2.mSeekableFileDescriptor = r0     // Catch: java.lang.Throwable -> L29
        L22:
            r2.loadAttributes(r1)     // Catch: java.lang.Throwable -> L29
            closeQuietly(r1)
            return
        L29:
            r3 = move-exception
            r0 = r1
            goto L2d
        L2c:
            r3 = move-exception
        L2d:
            closeQuietly(r0)
            throw r3
    }

    private static boolean isExifDataOnly(java.io.BufferedInputStream r4) throws java.io.IOException {
            byte[] r0 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            int r1 = r0.length
            r4.mark(r1)
            int r0 = r0.length
            byte[] r0 = new byte[r0]
            r4.read(r0)
            r4.reset()
            r4 = 0
            r1 = 0
        L11:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            int r3 = r2.length
            if (r1 >= r3) goto L20
            r3 = r0[r1]
            r2 = r2[r1]
            if (r3 == r2) goto L1d
            return r4
        L1d:
            int r1 = r1 + 1
            goto L11
        L20:
            r4 = 1
            return r4
    }

    private boolean isHeifFormat(byte[] r15) throws java.io.IOException {
            r14 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r2 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            r2.<init>(r15)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            int r1 = r2.readInt()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            long r3 = (long) r1     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            r1 = 4
            byte[] r5 = new byte[r1]     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            r2.read(r5)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            byte[] r6 = androidx.exifinterface.media.ExifInterface.HEIF_TYPE_FTYP     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            if (r5 != 0) goto L1e
            r2.close()
            return r0
        L1e:
            r5 = 16
            r7 = 8
            r9 = 1
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 != 0) goto L34
            long r3 = r2.readLong()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 >= 0) goto L35
            r2.close()
            return r0
        L34:
            r5 = r7
        L35:
            int r11 = r15.length     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            long r11 = (long) r11     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            int r13 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r13 <= 0) goto L3d
            int r15 = r15.length     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            long r3 = (long) r15
        L3d:
            long r3 = r3 - r5
            int r15 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r15 >= 0) goto L46
            r2.close()
            return r0
        L46:
            byte[] r15 = new byte[r1]     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            r5 = 0
            r7 = 0
            r8 = 0
        L4c:
            r11 = 4
            long r11 = r3 / r11
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 >= 0) goto L81
            int r11 = r2.read(r15)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            if (r11 == r1) goto L5e
            r2.close()
            return r0
        L5e:
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 != 0) goto L63
            goto L7f
        L63:
            byte[] r11 = androidx.exifinterface.media.ExifInterface.HEIF_BRAND_MIF1     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            r12 = 1
            if (r11 == 0) goto L6e
            r7 = 1
            goto L77
        L6e:
            byte[] r11 = androidx.exifinterface.media.ExifInterface.HEIF_BRAND_HEIC     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            if (r11 == 0) goto L77
            r8 = 1
        L77:
            if (r7 == 0) goto L7f
            if (r8 == 0) goto L7f
            r2.close()
            return r12
        L7f:
            long r5 = r5 + r9
            goto L4c
        L81:
            r2.close()
            goto L9e
        L85:
            r15 = move-exception
            r1 = r2
            goto L9f
        L88:
            r15 = move-exception
            r1 = r2
            goto L8e
        L8b:
            r15 = move-exception
            goto L9f
        L8d:
            r15 = move-exception
        L8e:
            boolean r2 = androidx.exifinterface.media.ExifInterface.DEBUG     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L99
            java.lang.String r2 = "ExifInterface"
            java.lang.String r3 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r3, r15)     // Catch: java.lang.Throwable -> L8b
        L99:
            if (r1 == 0) goto L9e
            r1.close()
        L9e:
            return r0
        L9f:
            if (r1 == 0) goto La4
            r1.close()
        La4:
            throw r15
    }

    private static boolean isJpegFormat(byte[] r4) throws java.io.IOException {
            r0 = 0
            r1 = 0
        L2:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.JPEG_SIGNATURE
            int r3 = r2.length
            if (r1 >= r3) goto L11
            r3 = r4[r1]
            r2 = r2[r1]
            if (r3 == r2) goto Le
            return r0
        Le:
            int r1 = r1 + 1
            goto L2
        L11:
            r4 = 1
            return r4
    }

    private boolean isOrfFormat(byte[] r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r2 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2d
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2d
            java.nio.ByteOrder r4 = r3.readByteOrder(r2)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r3.mExifByteOrder = r4     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r2.setByteOrder(r4)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            short r4 = r2.readShort()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r1 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r1) goto L1c
            r1 = 21330(0x5352, float:2.989E-41)
            if (r4 != r1) goto L1d
        L1c:
            r0 = 1
        L1d:
            r2.close()
            return r0
        L21:
            r4 = move-exception
            r1 = r2
            goto L27
        L24:
            r1 = r2
            goto L2e
        L26:
            r4 = move-exception
        L27:
            if (r1 == 0) goto L2c
            r1.close()
        L2c:
            throw r4
        L2d:
        L2e:
            if (r1 == 0) goto L33
            r1.close()
        L33:
            return r0
    }

    private boolean isPngFormat(byte[] r5) throws java.io.IOException {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.PNG_SIGNATURE
            int r3 = r2.length
            if (r1 >= r3) goto L11
            r3 = r5[r1]
            r2 = r2[r1]
            if (r3 == r2) goto Le
            return r0
        Le:
            int r1 = r1 + 1
            goto L2
        L11:
            r5 = 1
            return r5
    }

    private boolean isRafFormat(byte[] r6) throws java.io.IOException {
            r5 = this;
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r1 = "FUJIFILMCCD-RAW"
            byte[] r0 = r1.getBytes(r0)
            r1 = 0
            r2 = 0
        Lc:
            int r3 = r0.length
            if (r2 >= r3) goto L19
            r3 = r6[r2]
            r4 = r0[r2]
            if (r3 == r4) goto L16
            return r1
        L16:
            int r2 = r2 + 1
            goto Lc
        L19:
            r6 = 1
            return r6
    }

    private boolean isRw2Format(byte[] r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r2 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L29
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L29
            java.nio.ByteOrder r4 = r3.readByteOrder(r2)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r3.mExifByteOrder = r4     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r2.setByteOrder(r4)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            short r4 = r2.readShort()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r1 = 85
            if (r4 != r1) goto L19
            r0 = 1
        L19:
            r2.close()
            return r0
        L1d:
            r4 = move-exception
            r1 = r2
            goto L23
        L20:
            r1 = r2
            goto L2a
        L22:
            r4 = move-exception
        L23:
            if (r1 == 0) goto L28
            r1.close()
        L28:
            throw r4
        L29:
        L2a:
            if (r1 == 0) goto L2f
            r1.close()
        L2f:
            return r0
    }

    private static boolean isSeekableFD(java.io.FileDescriptor r3) {
            r0 = 0
            int r2 = android.system.OsConstants.SEEK_CUR     // Catch: java.lang.Exception -> L9
            android.system.Os.lseek(r3, r0, r2)     // Catch: java.lang.Exception -> L9
            r3 = 1
            return r3
        L9:
            boolean r3 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r3 == 0) goto L15
            java.lang.String r3 = "ExifInterface"
            java.lang.String r0 = "The file descriptor for the given input is not seekable"
            android.util.Log.d(r3, r0)
        L15:
            r3 = 0
            return r3
    }

    private boolean isSupportedDataType(java.util.HashMap r6) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "BitsPerSample"
            java.lang.Object r0 = r6.get(r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            if (r0 == 0) goto L45
            java.nio.ByteOrder r1 = r5.mExifByteOrder
            java.lang.Object r0 = r0.getValue(r1)
            int[] r0 = (int[]) r0
            int[] r1 = androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_RGB
            boolean r2 = java.util.Arrays.equals(r1, r0)
            r3 = 1
            if (r2 == 0) goto L1c
            return r3
        L1c:
            int r2 = r5.mMimeType
            r4 = 3
            if (r2 != r4) goto L45
            java.lang.String r2 = "PhotometricInterpretation"
            java.lang.Object r6 = r6.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r6
            if (r6 == 0) goto L45
            java.nio.ByteOrder r2 = r5.mExifByteOrder
            int r6 = r6.getIntValue(r2)
            if (r6 != r3) goto L3b
            int[] r2 = androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_GREYSCALE_2
            boolean r2 = java.util.Arrays.equals(r0, r2)
            if (r2 != 0) goto L44
        L3b:
            r2 = 6
            if (r6 != r2) goto L45
            boolean r6 = java.util.Arrays.equals(r0, r1)
            if (r6 == 0) goto L45
        L44:
            return r3
        L45:
            boolean r6 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r6 == 0) goto L50
            java.lang.String r6 = "ExifInterface"
            java.lang.String r0 = "Unsupported data type value"
            android.util.Log.d(r6, r0)
        L50:
            r6 = 0
            return r6
    }

    private boolean isSupportedFormatForSavingAttributes() {
            r2 = this;
            boolean r0 = r2.mIsSupportedFile
            if (r0 == 0) goto L13
            int r0 = r2.mMimeType
            r1 = 4
            if (r0 == r1) goto L11
            r1 = 13
            if (r0 == r1) goto L11
            r1 = 14
            if (r0 != r1) goto L13
        L11:
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
    }

    public static boolean isSupportedMimeType(@androidx.annotation.NonNull java.lang.String r4) {
            java.lang.String r0 = "mimeType shouldn't be null"
            java.util.Objects.requireNonNull(r4, r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r0)
            java.util.Objects.requireNonNull(r4)
            r0 = -1
            int r1 = r4.hashCode()
            r2 = 1
            r3 = 0
            switch(r1) {
                case -1875291391: goto Lc9;
                case -1635437028: goto Lbe;
                case -1594371159: goto Lb3;
                case -1487464693: goto La8;
                case -1487464690: goto L9d;
                case -1487394660: goto L92;
                case -1487018032: goto L87;
                case -1423313290: goto L7c;
                case -985160897: goto L6e;
                case -879258763: goto L60;
                case -332763809: goto L52;
                case 1378106698: goto L44;
                case 2099152104: goto L36;
                case 2099152524: goto L28;
                case 2111234748: goto L1a;
                default: goto L18;
            }
        L18:
            goto Ld3
        L1a:
            java.lang.String r1 = "image/x-canon-cr2"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L24
            goto Ld3
        L24:
            r0 = 14
            goto Ld3
        L28:
            java.lang.String r1 = "image/x-nikon-nrw"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L32
            goto Ld3
        L32:
            r0 = 13
            goto Ld3
        L36:
            java.lang.String r1 = "image/x-nikon-nef"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L40
            goto Ld3
        L40:
            r0 = 12
            goto Ld3
        L44:
            java.lang.String r1 = "image/x-olympus-orf"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L4e
            goto Ld3
        L4e:
            r0 = 11
            goto Ld3
        L52:
            java.lang.String r1 = "image/x-pentax-pef"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L5c
            goto Ld3
        L5c:
            r0 = 10
            goto Ld3
        L60:
            java.lang.String r1 = "image/png"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L6a
            goto Ld3
        L6a:
            r0 = 9
            goto Ld3
        L6e:
            java.lang.String r1 = "image/x-panasonic-rw2"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L78
            goto Ld3
        L78:
            r0 = 8
            goto Ld3
        L7c:
            java.lang.String r1 = "image/x-adobe-dng"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L85
            goto Ld3
        L85:
            r0 = 7
            goto Ld3
        L87:
            java.lang.String r1 = "image/webp"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L90
            goto Ld3
        L90:
            r0 = 6
            goto Ld3
        L92:
            java.lang.String r1 = "image/jpeg"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L9b
            goto Ld3
        L9b:
            r0 = 5
            goto Ld3
        L9d:
            java.lang.String r1 = "image/heif"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto La6
            goto Ld3
        La6:
            r0 = 4
            goto Ld3
        La8:
            java.lang.String r1 = "image/heic"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto Lb1
            goto Ld3
        Lb1:
            r0 = 3
            goto Ld3
        Lb3:
            java.lang.String r1 = "image/x-sony-arw"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto Lbc
            goto Ld3
        Lbc:
            r0 = 2
            goto Ld3
        Lbe:
            java.lang.String r1 = "image/x-samsung-srw"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto Lc7
            goto Ld3
        Lc7:
            r0 = 1
            goto Ld3
        Lc9:
            java.lang.String r1 = "image/x-fuji-raf"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto Ld2
            goto Ld3
        Ld2:
            r0 = 0
        Ld3:
            switch(r0) {
                case 0: goto Ld7;
                case 1: goto Ld7;
                case 2: goto Ld7;
                case 3: goto Ld7;
                case 4: goto Ld7;
                case 5: goto Ld7;
                case 6: goto Ld7;
                case 7: goto Ld7;
                case 8: goto Ld7;
                case 9: goto Ld7;
                case 10: goto Ld7;
                case 11: goto Ld7;
                case 12: goto Ld7;
                case 13: goto Ld7;
                case 14: goto Ld7;
                default: goto Ld6;
            }
        Ld6:
            return r3
        Ld7:
            return r2
    }

    private boolean isThumbnail(java.util.HashMap r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "ImageLength"
            java.lang.Object r0 = r3.get(r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.lang.String r1 = "ImageWidth"
            java.lang.Object r3 = r3.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            if (r0 == 0) goto L28
            if (r3 == 0) goto L28
            java.nio.ByteOrder r1 = r2.mExifByteOrder
            int r0 = r0.getIntValue(r1)
            java.nio.ByteOrder r1 = r2.mExifByteOrder
            int r3 = r3.getIntValue(r1)
            r1 = 512(0x200, float:7.17E-43)
            if (r0 > r1) goto L28
            if (r3 > r1) goto L28
            r3 = 1
            return r3
        L28:
            r3 = 0
            return r3
    }

    private boolean isWebpFormat(byte[] r5) throws java.io.IOException {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_1
            int r3 = r2.length
            if (r1 >= r3) goto L11
            r3 = r5[r1]
            r2 = r2[r1]
            if (r3 == r2) goto Le
            return r0
        Le:
            int r1 = r1 + 1
            goto L2
        L11:
            r1 = 0
        L12:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_2
            int r3 = r2.length
            if (r1 >= r3) goto L27
            byte[] r3 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_1
            int r3 = r3.length
            int r3 = r3 + r1
            int r3 = r3 + 4
            r3 = r5[r3]
            r2 = r2[r1]
            if (r3 == r2) goto L24
            return r0
        L24:
            int r1 = r1 + 1
            goto L12
        L27:
            r5 = 1
            return r5
    }

    private void loadAttributes(@androidx.annotation.NonNull java.io.InputStream r5) {
            r4 = this;
            java.lang.String r0 = "inputstream shouldn't be null"
            java.util.Objects.requireNonNull(r5, r0)
            r0 = 0
            r1 = 0
        L7:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r2 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            int r2 = r2.length     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            if (r1 >= r2) goto L18
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r4.mAttributes     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r3.<init>()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r2[r1] = r3     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            int r1 = r1 + 1
            goto L7
        L18:
            boolean r1 = r4.mIsExifDataOnly     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            if (r1 != 0) goto L2a
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            int r5 = r4.getMimeType(r1)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r4.mMimeType = r5     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r5 = r1
        L2a:
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r1 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            boolean r5 = r4.mIsExifDataOnly     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            if (r5 != 0) goto L59
            int r5 = r4.mMimeType     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            switch(r5) {
                case 0: goto L55;
                case 1: goto L55;
                case 2: goto L55;
                case 3: goto L55;
                case 4: goto L51;
                case 5: goto L55;
                case 6: goto L55;
                case 7: goto L4d;
                case 8: goto L55;
                case 9: goto L49;
                case 10: goto L45;
                case 11: goto L55;
                case 12: goto L41;
                case 13: goto L3d;
                case 14: goto L39;
                default: goto L38;
            }     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
        L38:
            goto L5c
        L39:
            r4.getWebpAttributes(r1)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            goto L5c
        L3d:
            r4.getPngAttributes(r1)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            goto L5c
        L41:
            r4.getHeifAttributes(r1)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            goto L5c
        L45:
            r4.getRw2Attributes(r1)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            goto L5c
        L49:
            r4.getRafAttributes(r1)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            goto L5c
        L4d:
            r4.getOrfAttributes(r1)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            goto L5c
        L51:
            r4.getJpegAttributes(r1, r0, r0)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            goto L5c
        L55:
            r4.getRawAttributes(r1)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            goto L5c
        L59:
            r4.getStandaloneAttributes(r1)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
        L5c:
            r4.setThumbnailData(r1)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r5 = 1
            r4.mIsSupportedFile = r5     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r4.addDefaultValuesForCompatibility()
            boolean r5 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r5 == 0) goto L82
            goto L7f
        L6a:
            r5 = move-exception
            goto L83
        L6c:
            r5 = move-exception
            r4.mIsSupportedFile = r0     // Catch: java.lang.Throwable -> L6a
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L7a
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch: java.lang.Throwable -> L6a
        L7a:
            r4.addDefaultValuesForCompatibility()
            if (r0 == 0) goto L82
        L7f:
            r4.printAttributes()
        L82:
            return
        L83:
            r4.addDefaultValuesForCompatibility()
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto L8d
            r4.printAttributes()
        L8d:
            throw r5
    }

    private static long parseDateTime(@androidx.annotation.Nullable java.lang.String r7, @androidx.annotation.Nullable java.lang.String r8) {
            r0 = -1
            if (r7 == 0) goto L36
            java.util.regex.Pattern r2 = androidx.exifinterface.media.ExifInterface.sNonZeroTimePattern
            java.util.regex.Matcher r2 = r2.matcher(r7)
            boolean r2 = r2.matches()
            if (r2 != 0) goto L11
            goto L36
        L11:
            java.text.ParsePosition r2 = new java.text.ParsePosition
            r3 = 0
            r2.<init>(r3)
            java.text.SimpleDateFormat r3 = androidx.exifinterface.media.ExifInterface.sFormatter     // Catch: java.lang.IllegalArgumentException -> L36
            java.util.Date r7 = r3.parse(r7, r2)     // Catch: java.lang.IllegalArgumentException -> L36
            if (r7 != 0) goto L20
            return r0
        L20:
            long r2 = r7.getTime()     // Catch: java.lang.IllegalArgumentException -> L36
            if (r8 == 0) goto L35
            long r7 = java.lang.Long.parseLong(r8)     // Catch: java.lang.NumberFormatException -> L35 java.lang.IllegalArgumentException -> L36
        L2a:
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 <= 0) goto L34
            r4 = 10
            long r7 = r7 / r4
            goto L2a
        L34:
            long r2 = r2 + r7
        L35:
            return r2
        L36:
            return r0
    }

    private void parseTiffHeaders(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r4, int r5) throws java.io.IOException {
            r3 = this;
            java.nio.ByteOrder r0 = r3.readByteOrder(r4)
            r3.mExifByteOrder = r0
            r4.setByteOrder(r0)
            int r0 = r4.readUnsignedShort()
            int r1 = r3.mMimeType
            r2 = 7
            if (r1 == r2) goto L32
            r2 = 10
            if (r1 == r2) goto L32
            r1 = 42
            if (r0 != r1) goto L1b
            goto L32
        L1b:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Invalid start code: "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L32:
            int r0 = r4.readInt()
            r1 = 8
            if (r0 < r1) goto L54
            if (r0 >= r5) goto L54
            int r0 = r0 + (-8)
            if (r0 <= 0) goto L53
            int r4 = r4.skipBytes(r0)
            if (r4 != r0) goto L47
            goto L53
        L47:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Couldn't jump to first Ifd: "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r0)
            r4.<init>(r5)
            throw r4
        L53:
            return
        L54:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Invalid first Ifd offset: "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r0)
            r4.<init>(r5)
            throw r4
    }

    private void printAttributes() {
            r6 = this;
            r0 = 0
        L1:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r6.mAttributes
            int r1 = r1.length
            if (r0 >= r1) goto L7a
            java.lang.String r1 = "The size of tag group["
            java.lang.String r2 = "]: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r1, r0, r2)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r2 = r2[r0]
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ExifInterface"
            android.util.Log.d(r2, r1)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r6.mAttributes
            r1 = r1[r0]
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L77
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            java.lang.String r5 = "tagName: "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r5.append(r3)
            java.lang.String r3 = ", tagType: "
            r5.append(r3)
            java.lang.String r3 = r4.toString()
            r5.append(r3)
            java.lang.String r3 = ", tagValue: '"
            r5.append(r3)
            java.nio.ByteOrder r3 = r6.mExifByteOrder
            java.lang.String r3 = r4.getStringValue(r3)
            r5.append(r3)
            java.lang.String r3 = "'"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.d(r2, r3)
            goto L2e
        L77:
            int r0 = r0 + 1
            goto L1
        L7a:
            return
    }

    private java.nio.ByteOrder readByteOrder(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r3) throws java.io.IOException {
            r2 = this;
            short r3 = r3.readShort()
            r0 = 18761(0x4949, float:2.629E-41)
            java.lang.String r1 = "ExifInterface"
            if (r3 == r0) goto L32
            r0 = 19789(0x4d4d, float:2.773E-41)
            if (r3 != r0) goto L1b
            boolean r3 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r3 == 0) goto L18
            java.lang.String r3 = "readExifSegment: Byte Align MM"
            android.util.Log.d(r1, r3)
        L18:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            return r3
        L1b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Invalid byte order: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L32:
            boolean r3 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r3 == 0) goto L3c
            java.lang.String r3 = "readExifSegment: Byte Align II"
            android.util.Log.d(r1, r3)
        L3c:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            return r3
    }

    private void readExifSegment(byte[] r2, int r3) throws java.io.IOException {
            r1 = this;
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r0 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            r0.<init>(r2)
            int r2 = r2.length
            r1.parseTiffHeaders(r0, r2)
            r1.readImageFileDirectory(r0, r3)
            return
    }

    private void readImageFileDirectory(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r24, int r25) throws java.io.IOException {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.util.Set<java.lang.Integer> r3 = r0.mAttributesOffsets
            int r4 = r1.mPosition
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.mPosition
            int r3 = r3 + 2
            int r4 = r1.mLength
            if (r3 <= r4) goto L1a
            return
        L1a:
            short r3 = r24.readShort()
            boolean r4 = androidx.exifinterface.media.ExifInterface.DEBUG
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L38
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L38:
            int r4 = r1.mPosition
            int r6 = r3 * 12
            int r6 = r6 + r4
            int r4 = r1.mLength
            if (r6 > r4) goto L42d
            if (r3 > 0) goto L45
            goto L42d
        L45:
            r4 = 0
            r6 = 0
        L47:
            r7 = 5
            if (r6 >= r3) goto L3a4
            int r8 = r24.readUnsignedShort()
            int r9 = r24.readUnsignedShort()
            int r12 = r24.readInt()
            int r10 = r24.peek()
            long r10 = (long) r10
            r13 = 4
            long r10 = r10 + r13
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface$ExifTag>[] r15 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForReading
            r15 = r15[r2]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            java.lang.Object r13 = r15.get(r13)
            r15 = r13
            androidx.exifinterface.media.ExifInterface$ExifTag r15 = (androidx.exifinterface.media.ExifInterface.ExifTag) r15
            boolean r13 = androidx.exifinterface.media.ExifInterface.DEBUG
            r14 = 3
            if (r13 == 0) goto La2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r18 = java.lang.Integer.valueOf(r25)
            r7[r4] = r18
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r18 = 1
            r7[r18] = r4
            if (r15 == 0) goto L87
            java.lang.String r4 = r15.name
            goto L88
        L87:
            r4 = 0
        L88:
            r18 = 2
            r7[r18] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r7[r14] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r14 = 4
            r7[r14] = r4
            java.lang.String r4 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r4 = java.lang.String.format(r4, r7)
            android.util.Log.d(r5, r4)
        La2:
            r4 = 7
            if (r15 != 0) goto Lbf
            if (r13 == 0) goto Lbb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "Skip the tag entry since tag number is not defined: "
            r4.append(r7)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        Lbb:
            r18 = r3
            goto L11e
        Lbf:
            if (r9 <= 0) goto L155
            int[] r7 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
            int r14 = r7.length
            if (r9 < r14) goto Lc8
            goto L155
        Lc8:
            int r14 = r15.primaryFormat
            if (r14 == r4) goto Lf9
            if (r9 != r4) goto Lcf
            goto Lf9
        Lcf:
            if (r14 == r9) goto Lf9
            int r4 = r15.secondaryFormat
            if (r4 != r9) goto Ld6
            goto Lf9
        Ld6:
            r18 = r3
            r3 = 4
            if (r14 == r3) goto Ldd
            if (r4 != r3) goto Le1
        Ldd:
            r3 = 3
            if (r9 != r3) goto Le1
            goto Lfb
        Le1:
            r3 = 9
            if (r14 == r3) goto Le7
            if (r4 != r3) goto Lec
        Le7:
            r3 = 8
            if (r9 != r3) goto Lec
            goto Lfb
        Lec:
            r3 = 12
            if (r14 == r3) goto Lf2
            if (r4 != r3) goto Lf7
        Lf2:
            r3 = 11
            if (r9 != r3) goto Lf7
            goto Lfb
        Lf7:
            r3 = 0
            goto Lfc
        Lf9:
            r18 = r3
        Lfb:
            r3 = 1
        Lfc:
            if (r3 != 0) goto L121
            if (r13 == 0) goto L11e
            java.lang.String r3 = "Skip the tag entry since data format ("
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.String[] r4 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_NAMES
            r4 = r4[r9]
            r3.append(r4)
            java.lang.String r4 = ") is unexpected for tag: "
            r3.append(r4)
            java.lang.String r4 = r15.name
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L11e:
            r19 = r6
            goto L16f
        L121:
            r3 = 7
            if (r9 != r3) goto L125
            r9 = r14
        L125:
            long r3 = (long) r12
            r7 = r7[r9]
            r19 = r6
            long r6 = (long) r7
            long r3 = r3 * r6
            r6 = 0
            int r14 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r14 < 0) goto L13d
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r14 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r14 <= 0) goto L13b
            goto L13d
        L13b:
            r6 = 1
            goto L172
        L13d:
            if (r13 == 0) goto L153
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since the number of components is invalid: "
            r6.append(r7)
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L153:
            r6 = 0
            goto L172
        L155:
            r18 = r3
            r19 = r6
            if (r13 == 0) goto L16f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data format is invalid: "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L16f:
            r6 = 0
            r3 = 0
        L172:
            if (r6 != 0) goto L179
            r1.seek(r10)
            goto L39a
        L179:
            java.lang.String r6 = "Compression"
            r16 = 4
            int r7 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r7 <= 0) goto L243
            int r7 = r24.readInt()
            if (r13 == 0) goto L19f
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r16 = r9
            java.lang.String r9 = "seek to data offset: "
            r14.append(r9)
            r14.append(r7)
            java.lang.String r9 = r14.toString()
            android.util.Log.d(r5, r9)
            goto L1a1
        L19f:
            r16 = r9
        L1a1:
            int r9 = r0.mMimeType
            r14 = 7
            if (r9 != r14) goto L1ff
            java.lang.String r9 = r15.name
            java.lang.String r14 = "MakerNote"
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L1b3
            r0.mOrfMakerNoteOffset = r7
            goto L1fb
        L1b3:
            r9 = 6
            if (r2 != r9) goto L1fb
            java.lang.String r9 = r15.name
            java.lang.String r14 = "ThumbnailImage"
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L1fb
            r0.mOrfThumbnailOffset = r7
            r0.mOrfThumbnailLength = r12
            java.nio.ByteOrder r9 = r0.mExifByteOrder
            r14 = 6
            androidx.exifinterface.media.ExifInterface$ExifAttribute r9 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r14, r9)
            int r14 = r0.mOrfThumbnailOffset
            r20 = r10
            long r10 = (long) r14
            java.nio.ByteOrder r14 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r10, r14)
            int r11 = r0.mOrfThumbnailLength
            r14 = r12
            long r11 = (long) r11
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r11, r2)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r11 = r0.mAttributes
            r12 = 4
            r11 = r11[r12]
            r11.put(r6, r9)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.mAttributes
            r9 = r9[r12]
            java.lang.String r11 = "JPEGInterchangeFormat"
            r9.put(r11, r10)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.mAttributes
            r9 = r9[r12]
            java.lang.String r10 = "JPEGInterchangeFormatLength"
            r9.put(r10, r2)
            goto L212
        L1fb:
            r20 = r10
            r14 = r12
            goto L212
        L1ff:
            r20 = r10
            r14 = r12
            r2 = 10
            if (r9 != r2) goto L212
            java.lang.String r2 = r15.name
            java.lang.String r9 = "JpgFromRaw"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L212
            r0.mRw2JpgFromRawOffset = r7
        L212:
            long r9 = (long) r7
            long r11 = r9 + r3
            int r2 = r1.mLength
            r22 = r14
            r17 = r15
            long r14 = (long) r2
            int r2 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r2 > 0) goto L226
            r1.seek(r9)
            r10 = r20
            goto L249
        L226:
            if (r13 == 0) goto L23c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip the tag entry since data offset is invalid: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r5, r2)
        L23c:
            r10 = r20
            r1.seek(r10)
            goto L39a
        L243:
            r16 = r9
            r22 = r12
            r17 = r15
        L249:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = androidx.exifinterface.media.ExifInterface.sExifPointerTagMap
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            java.lang.Object r2 = r2.get(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r13 == 0) goto L273
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "nextIfdType: "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r8 = " byteCount: "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r5, r7)
        L273:
            if (r2 == 0) goto L320
            r3 = -1
            r6 = 3
            r9 = r16
            if (r9 == r6) goto L29b
            r6 = 4
            if (r9 == r6) goto L296
            r6 = 8
            if (r9 == r6) goto L291
            r6 = 9
            if (r9 == r6) goto L28c
            r6 = 13
            if (r9 == r6) goto L28c
            goto L2a0
        L28c:
            int r3 = r24.readInt()
            goto L29f
        L291:
            short r3 = r24.readShort()
            goto L29f
        L296:
            long r3 = r24.readUnsignedInt()
            goto L2a0
        L29b:
            int r3 = r24.readUnsignedShort()
        L29f:
            long r3 = (long) r3
        L2a0:
            r6 = 2
            if (r13 == 0) goto L2bc
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            r8 = 0
            r6[r8] = r7
            r7 = r17
            java.lang.String r7 = r7.name
            r8 = 1
            r6[r8] = r7
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            android.util.Log.d(r5, r6)
        L2bc:
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L305
            int r6 = r1.mLength
            long r6 = (long) r6
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 >= 0) goto L305
            java.util.Set<java.lang.Integer> r6 = r0.mAttributesOffsets
            int r7 = (int) r3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L2e1
            r1.seek(r3)
            int r2 = r2.intValue()
            r0.readImageFileDirectory(r1, r2)
            goto L31b
        L2e1:
            if (r13 == 0) goto L31b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip jump into the IFD since it has already been read: IfdType "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = " (at "
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = ")"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            android.util.Log.d(r5, r2)
            goto L31b
        L305:
            if (r13 == 0) goto L31b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r5, r2)
        L31b:
            r1.seek(r10)
            goto L39a
        L320:
            r9 = r16
            r7 = r17
            int r2 = r24.peek()
            int r8 = r0.mExifOffset
            int r2 = r2 + r8
            int r4 = (int) r3
            byte[] r15 = new byte[r4]
            r1.readFully(r15)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
            long r13 = (long) r2
            r11 = r10
            r10 = r3
            r7 = r11
            r11 = r9
            r12 = r22
            r2 = r17
            r10.<init>(r11, r12, r13, r15)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r25]
            java.lang.String r9 = r2.name
            r4.put(r9, r3)
            java.lang.String r4 = r2.name
            java.lang.String r9 = "DNGVersion"
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L355
            r4 = 3
            r0.mMimeType = r4
        L355:
            java.lang.String r4 = r2.name
            java.lang.String r9 = "Make"
            boolean r4 = r9.equals(r4)
            if (r4 != 0) goto L369
            java.lang.String r4 = r2.name
            java.lang.String r9 = "Model"
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L377
        L369:
            java.nio.ByteOrder r4 = r0.mExifByteOrder
            java.lang.String r4 = r3.getStringValue(r4)
            java.lang.String r9 = "PENTAX"
            boolean r4 = r4.contains(r9)
            if (r4 != 0) goto L38a
        L377:
            java.lang.String r2 = r2.name
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L38e
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            int r2 = r3.getIntValue(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L38e
        L38a:
            r2 = 8
            r0.mMimeType = r2
        L38e:
            int r2 = r24.peek()
            long r2 = (long) r2
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 == 0) goto L39a
            r1.seek(r7)
        L39a:
            int r6 = r19 + 1
            short r6 = (short) r6
            r4 = 0
            r2 = r25
            r3 = r18
            goto L47
        L3a4:
            int r2 = r24.peek()
            int r2 = r2 + 4
            int r3 = r1.mLength
            if (r2 > r3) goto L42d
            int r2 = r24.readInt()
            boolean r3 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r3 == 0) goto L3c9
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r4[r8] = r6
            java.lang.String r6 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r6, r4)
            android.util.Log.d(r5, r4)
        L3c9:
            long r8 = (long) r2
            r10 = 0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L417
            int r4 = r1.mLength
            if (r2 >= r4) goto L417
            java.util.Set<java.lang.Integer> r4 = r0.mAttributesOffsets
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.contains(r6)
            if (r4 != 0) goto L400
            r1.seek(r8)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L3f2
            r0.readImageFileDirectory(r1, r3)
            goto L42d
        L3f2:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r7]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L42d
            r0.readImageFileDirectory(r1, r7)
            goto L42d
        L400:
            if (r3 == 0) goto L42d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
            goto L42d
        L417:
            if (r3 == 0) goto L42d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
        L42d:
            return
    }

    private void removeAttribute(java.lang.String r3) {
            r2 = this;
            r0 = 0
        L1:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r1 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r1.length
            if (r0 >= r1) goto L10
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r2.mAttributes
            r1 = r1[r0]
            r1.remove(r3)
            int r0 = r0 + 1
            goto L1
        L10:
            return
    }

    private void retrieveJpegImageSize(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r4, int r5) throws java.io.IOException {
            r3 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r3.mAttributes
            r0 = r0[r5]
            java.lang.String r1 = "ImageLength"
            java.lang.Object r0 = r0.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r3.mAttributes
            r1 = r1[r5]
            java.lang.String r2 = "ImageWidth"
            java.lang.Object r1 = r1.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            if (r0 == 0) goto L1c
            if (r1 != 0) goto L33
        L1c:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r3.mAttributes
            r0 = r0[r5]
            java.lang.String r1 = "JPEGInterchangeFormat"
            java.lang.Object r0 = r0.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            if (r0 == 0) goto L33
            java.nio.ByteOrder r1 = r3.mExifByteOrder
            int r0 = r0.getIntValue(r1)
            r3.getJpegAttributes(r4, r0, r5)
        L33:
            return
    }

    private void saveJpegAttributes(java.io.InputStream r13, java.io.OutputStream r14) throws java.io.IOException {
            r12 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "saveJpegAttributes starting with (inputStream: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = ", outputStream: "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L28:
            java.io.DataInputStream r0 = new java.io.DataInputStream
            r0.<init>(r13)
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream r13 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r13.<init>(r14, r1)
            byte r14 = r0.readByte()
            java.lang.String r1 = "Invalid marker"
            r2 = -1
            if (r14 != r2) goto L12a
            r13.writeByte(r2)
            byte r14 = r0.readByte()
            r3 = -40
            if (r14 != r3) goto L124
            r13.writeByte(r3)
            r14 = 0
            java.lang.String r3 = "Xmp"
            java.lang.String r4 = r12.getAttribute(r3)
            r5 = 0
            if (r4 == 0) goto L63
            boolean r4 = r12.mXmpIsFromSeparateMarker
            if (r4 == 0) goto L63
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r14 = r12.mAttributes
            r14 = r14[r5]
            java.lang.Object r14 = r14.remove(r3)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r14 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r14
        L63:
            r13.writeByte(r2)
            r4 = -31
            r13.writeByte(r4)
            r12.writeExifSegment(r13)
            if (r14 == 0) goto L77
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r6 = r12.mAttributes
            r6 = r6[r5]
            r6.put(r3, r14)
        L77:
            r14 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r14]
        L7b:
            byte r6 = r0.readByte()
            if (r6 != r2) goto L11e
            byte r6 = r0.readByte()
            r7 = -39
            if (r6 == r7) goto L114
            r7 = -38
            if (r6 == r7) goto L114
            java.lang.String r7 = "Invalid length"
            if (r6 == r4) goto Lb9
            r13.writeByte(r2)
            r13.writeByte(r6)
            int r6 = r0.readUnsignedShort()
            r13.writeUnsignedShort(r6)
            int r6 = r6 + (-2)
            if (r6 < 0) goto Lb3
        La2:
            if (r6 <= 0) goto L7b
            int r7 = java.lang.Math.min(r6, r14)
            int r7 = r0.read(r3, r5, r7)
            if (r7 < 0) goto L7b
            r13.write(r3, r5, r7)
            int r6 = r6 - r7
            goto La2
        Lb3:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r7)
            throw r13
        Lb9:
            int r8 = r0.readUnsignedShort()
            int r8 = r8 + (-2)
            if (r8 < 0) goto L10e
            r9 = 6
            byte[] r10 = new byte[r9]
            if (r8 < r9) goto Leb
            int r11 = r0.read(r10)
            if (r11 != r9) goto Le3
            byte[] r11 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            boolean r11 = java.util.Arrays.equals(r10, r11)
            if (r11 == 0) goto Leb
            int r8 = r8 + (-6)
            int r6 = r0.skipBytes(r8)
            if (r6 != r8) goto Ldd
            goto L7b
        Ldd:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r7)
            throw r13
        Le3:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "Invalid exif"
            r13.<init>(r14)
            throw r13
        Leb:
            r13.writeByte(r2)
            r13.writeByte(r6)
            int r6 = r8 + 2
            r13.writeUnsignedShort(r6)
            if (r8 < r9) goto Lfd
            int r8 = r8 + (-6)
            r13.write(r10)
        Lfd:
            if (r8 <= 0) goto L7b
            int r6 = java.lang.Math.min(r8, r14)
            int r6 = r0.read(r3, r5, r6)
            if (r6 < 0) goto L7b
            r13.write(r3, r5, r6)
            int r8 = r8 - r6
            goto Lfd
        L10e:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r7)
            throw r13
        L114:
            r13.writeByte(r2)
            r13.writeByte(r6)
            copy(r0, r13)
            return
        L11e:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r1)
            throw r13
        L124:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r1)
            throw r13
        L12a:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r1)
            throw r13
    }

    private void savePngAttributes(java.io.InputStream r6, java.io.OutputStream r7) throws java.io.IOException {
            r5 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "savePngAttributes starting with (inputStream: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", outputStream: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L28:
            java.io.DataInputStream r0 = new java.io.DataInputStream
            r0.<init>(r6)
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream r6 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r6.<init>(r7, r1)
            byte[] r7 = androidx.exifinterface.media.ExifInterface.PNG_SIGNATURE
            int r2 = r7.length
            copy(r0, r6, r2)
            int r2 = r5.mExifOffset
            r3 = 4
            if (r2 != 0) goto L4c
            int r7 = r0.readInt()
            r6.writeInt(r7)
            int r7 = r7 + r3
            int r7 = r7 + r3
            copy(r0, r6, r7)
            goto L5c
        L4c:
            int r7 = r7.length
            int r2 = r2 - r7
            int r2 = r2 - r3
            int r2 = r2 - r3
            copy(r0, r6, r2)
            int r7 = r0.readInt()
            int r7 = r7 + r3
            int r7 = r7 + r3
            r0.skipBytes(r7)
        L5c:
            r7 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L91
            r2.<init>()     // Catch: java.lang.Throwable -> L91
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream r7 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream     // Catch: java.lang.Throwable -> L8e
            r7.<init>(r2, r1)     // Catch: java.lang.Throwable -> L8e
            r5.writeExifSegment(r7)     // Catch: java.lang.Throwable -> L8e
            java.io.OutputStream r7 = r7.mOutputStream     // Catch: java.lang.Throwable -> L8e
            java.io.ByteArrayOutputStream r7 = (java.io.ByteArrayOutputStream) r7     // Catch: java.lang.Throwable -> L8e
            byte[] r7 = r7.toByteArray()     // Catch: java.lang.Throwable -> L8e
            r6.write(r7)     // Catch: java.lang.Throwable -> L8e
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32     // Catch: java.lang.Throwable -> L8e
            r1.<init>()     // Catch: java.lang.Throwable -> L8e
            int r4 = r7.length     // Catch: java.lang.Throwable -> L8e
            int r4 = r4 - r3
            r1.update(r7, r3, r4)     // Catch: java.lang.Throwable -> L8e
            long r3 = r1.getValue()     // Catch: java.lang.Throwable -> L8e
            int r7 = (int) r3     // Catch: java.lang.Throwable -> L8e
            r6.writeInt(r7)     // Catch: java.lang.Throwable -> L8e
            closeQuietly(r2)
            copy(r0, r6)
            return
        L8e:
            r6 = move-exception
            r7 = r2
            goto L92
        L91:
            r6 = move-exception
        L92:
            closeQuietly(r7)
            throw r6
    }

    private void saveWebpAttributes(java.io.InputStream r12, java.io.OutputStream r13) throws java.io.IOException {
            r11 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "saveWebpAttributes starting with (inputStream: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = ", outputStream: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L28:
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r0 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.<init>(r12, r1)
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream r2 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream
            r2.<init>(r13, r1)
            byte[] r13 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_1
            int r3 = r13.length
            copy(r0, r2, r3)
            byte[] r3 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_2
            int r4 = r3.length
            r5 = 4
            int r4 = r4 + r5
            r0.skipBytes(r4)
            r4 = 0
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L10a java.lang.Exception -> L10c
            r6.<init>()     // Catch: java.lang.Throwable -> L10a java.lang.Exception -> L10c
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream r7 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r7.<init>(r6, r1)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r1 = r11.mExifOffset     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            if (r1 == 0) goto L6a
            int r12 = r13.length     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r12 = r12 + r5
            int r13 = r3.length     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r12 = r12 + r13
            int r1 = r1 - r12
            int r1 = r1 - r5
            int r1 = r1 - r5
            copy(r0, r7, r1)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r0.skipBytes(r5)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r12 = r0.readInt()     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r0.skipBytes(r12)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r11.writeExifSegment(r7)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            goto Ldc
        L6a:
            byte[] r13 = new byte[r5]     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r1 = r0.read(r13)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            if (r1 != r5) goto Lfc
            byte[] r1 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8X     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            boolean r3 = java.util.Arrays.equals(r13, r1)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            if (r3 == 0) goto Lcc
            int r13 = r0.readInt()     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r3 = r13 % 2
            r8 = 1
            if (r3 != r8) goto L86
            int r3 = r13 + 1
            goto L87
        L86:
            r3 = r13
        L87:
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r0.read(r3)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r9 = 0
            r10 = r3[r9]     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r10 = r10 | 8
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r3[r9] = r10     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r10 = r3[r9]     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r10 = r10 >> r8
            r10 = r10 & r8
            if (r10 != r8) goto L9b
            goto L9c
        L9b:
            r8 = 0
        L9c:
            r7.write(r1)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r7.writeInt(r13)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r7.write(r3)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            if (r8 == 0) goto Lc1
            byte[] r13 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_ANIM     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r11.copyChunksUpToGivenChunkType(r0, r7, r13, r4)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
        Lac:
            byte[] r13 = new byte[r5]     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r12.read(r13)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            byte[] r1 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_ANMF     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            boolean r1 = java.util.Arrays.equals(r13, r1)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            if (r1 != 0) goto Lbd
            r11.writeExifSegment(r7)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            goto Ldc
        Lbd:
            r11.copyWebPChunk(r0, r7, r13)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            goto Lac
        Lc1:
            byte[] r12 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            byte[] r13 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8L     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r11.copyChunksUpToGivenChunkType(r0, r7, r12, r13)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r11.writeExifSegment(r7)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            goto Ldc
        Lcc:
            byte[] r12 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            boolean r12 = java.util.Arrays.equals(r13, r12)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            if (r12 != 0) goto Lf4
            byte[] r12 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8L     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            boolean r12 = java.util.Arrays.equals(r13, r12)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            if (r12 != 0) goto Lf4
        Ldc:
            copy(r0, r7)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r12 = r6.size()     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            byte[] r13 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_2     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r0 = r13.length     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r12 = r12 + r0
            r2.writeInt(r12)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r2.write(r13)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r6.writeTo(r2)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            closeQuietly(r6)
            return
        Lf4:
            java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            java.lang.String r13 = "WebP files with only VP8 or VP8L chunks are currently not supported"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            throw r12     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
        Lfc:
            java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            java.lang.String r13 = "Encountered invalid length while parsing WebP chunk type"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            throw r12     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
        L104:
            r12 = move-exception
            r4 = r6
            goto L115
        L107:
            r12 = move-exception
            r4 = r6
            goto L10d
        L10a:
            r12 = move-exception
            goto L115
        L10c:
            r12 = move-exception
        L10d:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L10a
            java.lang.String r0 = "Failed to save WebP file"
            r13.<init>(r0, r12)     // Catch: java.lang.Throwable -> L10a
            throw r13     // Catch: java.lang.Throwable -> L10a
        L115:
            closeQuietly(r4)
            throw r12
    }

    private void setThumbnailData(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r5) throws java.io.IOException {
            r4 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r4.mAttributes
            r1 = 4
            r0 = r0[r1]
            java.lang.String r1 = "Compression"
            java.lang.Object r1 = r0.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            r2 = 6
            if (r1 == 0) goto L2f
            java.nio.ByteOrder r3 = r4.mExifByteOrder
            int r1 = r1.getIntValue(r3)
            r4.mThumbnailCompression = r1
            r3 = 1
            if (r1 == r3) goto L25
            if (r1 == r2) goto L21
            r2 = 7
            if (r1 == r2) goto L25
            goto L34
        L21:
            r4.handleThumbnailFromJfif(r5, r0)
            goto L34
        L25:
            boolean r1 = r4.isSupportedDataType(r0)
            if (r1 == 0) goto L34
            r4.handleThumbnailFromStrips(r5, r0)
            goto L34
        L2f:
            r4.mThumbnailCompression = r2
            r4.handleThumbnailFromJfif(r5, r0)
        L34:
            return
    }

    private static boolean startsWith(byte[] r4, byte[] r5) {
            r0 = 0
            if (r4 == 0) goto L1b
            if (r5 != 0) goto L6
            goto L1b
        L6:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 >= r2) goto Lb
            return r0
        Lb:
            r1 = 0
        Lc:
            int r2 = r5.length
            if (r1 >= r2) goto L19
            r2 = r4[r1]
            r3 = r5[r1]
            if (r2 == r3) goto L16
            return r0
        L16:
            int r1 = r1 + 1
            goto Lc
        L19:
            r4 = 1
            return r4
        L1b:
            return r0
    }

    private void swapBasedOnImageSize(int r7, int r8) throws java.io.IOException {
            r6 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r6.mAttributes
            r0 = r0[r7]
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "ExifInterface"
            if (r0 != 0) goto L89
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r6.mAttributes
            r0 = r0[r8]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            goto L89
        L18:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r6.mAttributes
            r0 = r0[r7]
            java.lang.String r2 = "ImageLength"
            java.lang.Object r0 = r0.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r6.mAttributes
            r3 = r3[r7]
            java.lang.String r4 = "ImageWidth"
            java.lang.Object r3 = r3.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r6.mAttributes
            r5 = r5[r8]
            java.lang.Object r2 = r5.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r2
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r6.mAttributes
            r5 = r5[r8]
            java.lang.Object r4 = r5.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            if (r0 == 0) goto L7f
            if (r3 != 0) goto L49
            goto L7f
        L49:
            if (r2 == 0) goto L75
            if (r4 != 0) goto L4e
            goto L75
        L4e:
            java.nio.ByteOrder r1 = r6.mExifByteOrder
            int r0 = r0.getIntValue(r1)
            java.nio.ByteOrder r1 = r6.mExifByteOrder
            int r1 = r3.getIntValue(r1)
            java.nio.ByteOrder r3 = r6.mExifByteOrder
            int r2 = r2.getIntValue(r3)
            java.nio.ByteOrder r3 = r6.mExifByteOrder
            int r3 = r4.getIntValue(r3)
            if (r0 >= r2) goto L88
            if (r1 >= r3) goto L88
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r6.mAttributes
            r1 = r0[r7]
            r2 = r0[r8]
            r0[r7] = r2
            r0[r8] = r1
            goto L88
        L75:
            boolean r7 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r7 == 0) goto L88
            java.lang.String r7 = "Second image does not contain valid size information"
            android.util.Log.d(r1, r7)
            goto L88
        L7f:
            boolean r7 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r7 == 0) goto L88
            java.lang.String r7 = "First image does not contain valid size information"
            android.util.Log.d(r1, r7)
        L88:
            return
        L89:
            boolean r7 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r7 == 0) goto L92
            java.lang.String r7 = "Cannot perform swap since only one image data exists"
            android.util.Log.d(r1, r7)
        L92:
            return
    }

    private void updateImageSizeValues(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r10, int r11) throws java.io.IOException {
            r9 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r9.mAttributes
            r0 = r0[r11]
            java.lang.String r1 = "DefaultCropSize"
            java.lang.Object r0 = r0.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r9.mAttributes
            r1 = r1[r11]
            java.lang.String r2 = "SensorTopBorder"
            java.lang.Object r1 = r1.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r9.mAttributes
            r2 = r2[r11]
            java.lang.String r3 = "SensorLeftBorder"
            java.lang.Object r2 = r2.get(r3)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r2
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r9.mAttributes
            r3 = r3[r11]
            java.lang.String r4 = "SensorBottomBorder"
            java.lang.Object r3 = r3.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r9.mAttributes
            r4 = r4[r11]
            java.lang.String r5 = "SensorRightBorder"
            java.lang.Object r4 = r4.get(r5)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            java.lang.String r5 = "ImageLength"
            java.lang.String r6 = "ImageWidth"
            if (r0 == 0) goto Lc0
            int r10 = r0.format
            r1 = 5
            r2 = 1
            r3 = 0
            r4 = 2
            java.lang.String r7 = "Invalid crop size values. cropSize="
            java.lang.String r8 = "ExifInterface"
            if (r10 != r1) goto L80
            java.nio.ByteOrder r10 = r9.mExifByteOrder
            java.lang.Object r10 = r0.getValue(r10)
            androidx.exifinterface.media.ExifInterface$Rational[] r10 = (androidx.exifinterface.media.ExifInterface.Rational[]) r10
            if (r10 == 0) goto L6d
            int r0 = r10.length
            if (r0 == r4) goto L5c
            goto L6d
        L5c:
            r0 = r10[r3]
            java.nio.ByteOrder r1 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createURational(r0, r1)
            r10 = r10[r2]
            java.nio.ByteOrder r1 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createURational(r10, r1)
            goto L9e
        L6d:
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7)
            java.lang.String r10 = java.util.Arrays.toString(r10)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            android.util.Log.w(r8, r10)
            return
        L80:
            java.nio.ByteOrder r10 = r9.mExifByteOrder
            java.lang.Object r10 = r0.getValue(r10)
            int[] r10 = (int[]) r10
            if (r10 == 0) goto Lad
            int r0 = r10.length
            if (r0 == r4) goto L8e
            goto Lad
        L8e:
            r0 = r10[r3]
            java.nio.ByteOrder r1 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r0, r1)
            r10 = r10[r2]
            java.nio.ByteOrder r1 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r10, r1)
        L9e:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r9.mAttributes
            r1 = r1[r11]
            r1.put(r6, r0)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r9.mAttributes
            r11 = r0[r11]
            r11.put(r5, r10)
            goto L104
        Lad:
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7)
            java.lang.String r10 = java.util.Arrays.toString(r10)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            android.util.Log.w(r8, r10)
            return
        Lc0:
            if (r1 == 0) goto L101
            if (r2 == 0) goto L101
            if (r3 == 0) goto L101
            if (r4 == 0) goto L101
            java.nio.ByteOrder r10 = r9.mExifByteOrder
            int r10 = r1.getIntValue(r10)
            java.nio.ByteOrder r0 = r9.mExifByteOrder
            int r0 = r3.getIntValue(r0)
            java.nio.ByteOrder r1 = r9.mExifByteOrder
            int r1 = r4.getIntValue(r1)
            java.nio.ByteOrder r3 = r9.mExifByteOrder
            int r2 = r2.getIntValue(r3)
            if (r0 <= r10) goto L104
            if (r1 <= r2) goto L104
            int r0 = r0 - r10
            int r1 = r1 - r2
            java.nio.ByteOrder r10 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r0, r10)
            java.nio.ByteOrder r0 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r1, r0)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r9.mAttributes
            r1 = r1[r11]
            r1.put(r5, r10)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r10 = r9.mAttributes
            r10 = r10[r11]
            r10.put(r6, r0)
            goto L104
        L101:
            r9.retrieveJpegImageSize(r10, r11)
        L104:
            return
    }

    private void validateImages() throws java.io.IOException {
            r7 = this;
            r0 = 0
            r1 = 5
            r7.swapBasedOnImageSize(r0, r1)
            r2 = 4
            r7.swapBasedOnImageSize(r0, r2)
            r7.swapBasedOnImageSize(r1, r2)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r7.mAttributes
            r4 = 1
            r3 = r3[r4]
            java.lang.String r5 = "PixelXDimension"
            java.lang.Object r3 = r3.get(r5)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r7.mAttributes
            r4 = r5[r4]
            java.lang.String r5 = "PixelYDimension"
            java.lang.Object r4 = r4.get(r5)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            if (r3 == 0) goto L3b
            if (r4 == 0) goto L3b
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r7.mAttributes
            r5 = r5[r0]
            java.lang.String r6 = "ImageWidth"
            r5.put(r6, r3)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r7.mAttributes
            r0 = r3[r0]
            java.lang.String r3 = "ImageLength"
            r0.put(r3, r4)
        L3b:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r7.mAttributes
            r0 = r0[r2]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r7.mAttributes
            r0 = r0[r1]
            boolean r0 = r7.isThumbnail(r0)
            if (r0 == 0) goto L5c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r7.mAttributes
            r3 = r0[r1]
            r0[r2] = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r0[r1] = r3
        L5c:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r7.mAttributes
            r0 = r0[r2]
            boolean r0 = r7.isThumbnail(r0)
            if (r0 != 0) goto L6d
            java.lang.String r0 = "ExifInterface"
            java.lang.String r1 = "No image meets the size requirements of a thumbnail image."
            android.util.Log.d(r0, r1)
        L6d:
            return
    }

    private int writeExifSegment(androidx.exifinterface.media.ExifInterface.ByteOrderedDataOutputStream r17) throws java.io.IOException {
            r16 = this;
            r0 = r16
            r1 = r17
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r2 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r3 = r2.length
            int[] r3 = new int[r3]
            int r2 = r2.length
            int[] r2 = new int[r2]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r4 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            int r5 = r4.length
            r6 = 0
            r7 = 0
        L11:
            if (r7 >= r5) goto L1d
            r8 = r4[r7]
            java.lang.String r8 = r8.name
            r0.removeAttribute(r8)
            int r7 = r7 + 1
            goto L11
        L1d:
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = androidx.exifinterface.media.ExifInterface.JPEG_INTERCHANGE_FORMAT_TAG
            java.lang.String r4 = r4.name
            r0.removeAttribute(r4)
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = androidx.exifinterface.media.ExifInterface.JPEG_INTERCHANGE_FORMAT_LENGTH_TAG
            java.lang.String r4 = r4.name
            r0.removeAttribute(r4)
            r4 = 0
        L2c:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r5 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r5 = r5.length
            if (r4 >= r5) goto L5c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r0.mAttributes
            r5 = r5[r4]
            java.util.Set r5 = r5.entrySet()
            java.lang.Object[] r5 = r5.toArray()
            int r7 = r5.length
            r8 = 0
        L3f:
            if (r8 >= r7) goto L59
            r9 = r5[r8]
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getValue()
            if (r10 != 0) goto L56
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r10 = r0.mAttributes
            r10 = r10[r4]
            java.lang.Object r9 = r9.getKey()
            r10.remove(r9)
        L56:
            int r8 = r8 + 1
            goto L3f
        L59:
            int r4 = r4 + 1
            goto L2c
        L5c:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r5 = 1
            r4 = r4[r5]
            boolean r4 = r4.isEmpty()
            r7 = 0
            if (r4 != 0) goto L7c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r6]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r9 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r9 = r9[r5]
            java.lang.String r9 = r9.name
            java.nio.ByteOrder r10 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r7, r10)
            r4.put(r9, r10)
        L7c:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r9 = 2
            r4 = r4[r9]
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L9a
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r6]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r10 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r10 = r10[r9]
            java.lang.String r10 = r10.name
            java.nio.ByteOrder r11 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r11 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r7, r11)
            r4.put(r10, r11)
        L9a:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r10 = 3
            r4 = r4[r10]
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto Lb8
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r5]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r11 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r11 = r11[r10]
            java.lang.String r11 = r11.name
            java.nio.ByteOrder r12 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r12 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r7, r12)
            r4.put(r11, r12)
        Lb8:
            boolean r4 = r0.mHasThumbnail
            r11 = 4
            if (r4 == 0) goto Le2
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r11]
            androidx.exifinterface.media.ExifInterface$ExifTag r12 = androidx.exifinterface.media.ExifInterface.JPEG_INTERCHANGE_FORMAT_TAG
            java.lang.String r12 = r12.name
            java.nio.ByteOrder r13 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r13 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r7, r13)
            r4.put(r12, r13)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r11]
            androidx.exifinterface.media.ExifInterface$ExifTag r12 = androidx.exifinterface.media.ExifInterface.JPEG_INTERCHANGE_FORMAT_LENGTH_TAG
            java.lang.String r12 = r12.name
            int r13 = r0.mThumbnailLength
            long r13 = (long) r13
            java.nio.ByteOrder r15 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r13 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r13, r15)
            r4.put(r12, r13)
        Le2:
            r4 = 0
        Le3:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r12 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r12 = r12.length
            if (r4 >= r12) goto L117
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r12 = r0.mAttributes
            r12 = r12[r4]
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
            r13 = 0
        Lf5:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L10f
            java.lang.Object r14 = r12.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r14 = r14.getValue()
            androidx.exifinterface.media.ExifInterface$ExifAttribute r14 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r14
            int r14 = r14.size()
            if (r14 <= r11) goto Lf5
            int r13 = r13 + r14
            goto Lf5
        L10f:
            r12 = r2[r4]
            int r12 = r12 + r13
            r2[r4] = r12
            int r4 = r4 + 1
            goto Le3
        L117:
            r4 = 8
            r12 = 0
        L11a:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r13 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r13 = r13.length
            if (r12 >= r13) goto L13f
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r13 = r0.mAttributes
            r13 = r13[r12]
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L13c
            r3[r12] = r4
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r13 = r0.mAttributes
            r13 = r13[r12]
            int r13 = r13.size()
            int r13 = r13 * 12
            int r13 = r13 + r9
            int r13 = r13 + r11
            r14 = r2[r12]
            int r13 = r13 + r14
            int r13 = r13 + r4
            r4 = r13
        L13c:
            int r12 = r12 + 1
            goto L11a
        L13f:
            boolean r12 = r0.mHasThumbnail
            if (r12 == 0) goto L15d
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r12 = r0.mAttributes
            r12 = r12[r11]
            androidx.exifinterface.media.ExifInterface$ExifTag r13 = androidx.exifinterface.media.ExifInterface.JPEG_INTERCHANGE_FORMAT_TAG
            java.lang.String r13 = r13.name
            long r14 = (long) r4
            java.nio.ByteOrder r7 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r14, r7)
            r12.put(r13, r7)
            int r7 = r0.mExifOffset
            int r7 = r7 + r4
            r0.mThumbnailOffset = r7
            int r7 = r0.mThumbnailLength
            int r4 = r4 + r7
        L15d:
            int r7 = r0.mMimeType
            if (r7 != r11) goto L163
            int r4 = r4 + 8
        L163:
            boolean r7 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r7 == 0) goto L1a8
            r7 = 0
        L168:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r8 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r8 = r8.length
            if (r7 >= r8) goto L1a8
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r8[r6] = r12
            r12 = r3[r7]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r8[r5] = r12
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r12 = r0.mAttributes
            r12 = r12[r7]
            int r12 = r12.size()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r8[r9] = r12
            r12 = r2[r7]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r8[r10] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            r8[r11] = r12
            java.lang.String r12 = "index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d"
            java.lang.String r8 = java.lang.String.format(r12, r8)
            java.lang.String r12 = "ExifInterface"
            android.util.Log.d(r12, r8)
            int r7 = r7 + 1
            goto L168
        L1a8:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r5]
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L1c8
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r6]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r7 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r7 = r7[r5]
            java.lang.String r7 = r7.name
            r8 = r3[r5]
            long r12 = (long) r8
            java.nio.ByteOrder r8 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r8 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r12, r8)
            r2.put(r7, r8)
        L1c8:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r9]
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L1e8
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r6]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r7 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r7 = r7[r9]
            java.lang.String r7 = r7.name
            r8 = r3[r9]
            long r12 = (long) r8
            java.nio.ByteOrder r8 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r8 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r12, r8)
            r2.put(r7, r8)
        L1e8:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r10]
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L208
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r5]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r7 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r7 = r7[r10]
            java.lang.String r7 = r7.name
            r8 = r3[r10]
            long r12 = (long) r8
            java.nio.ByteOrder r8 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r8 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r12, r8)
            r2.put(r7, r8)
        L208:
            int r2 = r0.mMimeType
            r7 = 14
            if (r2 == r11) goto L227
            r8 = 13
            if (r2 == r8) goto L21e
            if (r2 == r7) goto L215
            goto L22f
        L215:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_EXIF
            r1.write(r2)
            r1.writeInt(r4)
            goto L22f
        L21e:
            r1.writeInt(r4)
            byte[] r2 = androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_EXIF
            r1.write(r2)
            goto L22f
        L227:
            r1.writeUnsignedShort(r4)
            byte[] r2 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            r1.write(r2)
        L22f:
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            java.nio.ByteOrder r8 = java.nio.ByteOrder.BIG_ENDIAN
            if (r2 != r8) goto L238
            r2 = 19789(0x4d4d, float:2.773E-41)
            goto L23a
        L238:
            r2 = 18761(0x4949, float:2.629E-41)
        L23a:
            r1.writeShort(r2)
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            r1.setByteOrder(r2)
            r2 = 42
            r1.writeUnsignedShort(r2)
            r12 = 8
            r1.writeUnsignedInt(r12)
            r2 = 0
        L24d:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r8 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r8 = r8.length
            if (r2 >= r8) goto L314
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r8 = r0.mAttributes
            r8 = r8[r2]
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L30e
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r8 = r0.mAttributes
            r8 = r8[r2]
            int r8 = r8.size()
            r1.writeUnsignedShort(r8)
            r8 = r3[r2]
            int r8 = r8 + r9
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r10 = r0.mAttributes
            r10 = r10[r2]
            int r10 = r10.size()
            int r10 = r10 * 12
            int r10 = r10 + r8
            int r10 = r10 + r11
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r8 = r0.mAttributes
            r8 = r8[r2]
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L282:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L2cc
            java.lang.Object r12 = r8.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifTag>[] r13 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForWriting
            r13 = r13[r2]
            java.lang.Object r14 = r12.getKey()
            java.lang.Object r13 = r13.get(r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r13 = (androidx.exifinterface.media.ExifInterface.ExifTag) r13
            int r13 = r13.number
            java.lang.Object r12 = r12.getValue()
            androidx.exifinterface.media.ExifInterface$ExifAttribute r12 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r12
            int r14 = r12.size()
            r1.writeUnsignedShort(r13)
            int r13 = r12.format
            r1.writeUnsignedShort(r13)
            int r13 = r12.numberOfComponents
            r1.writeInt(r13)
            if (r14 <= r11) goto L2bd
            long r12 = (long) r10
            r1.writeUnsignedInt(r12)
            int r10 = r10 + r14
            goto L282
        L2bd:
            byte[] r12 = r12.bytes
            r1.write(r12)
            if (r14 >= r11) goto L282
        L2c4:
            if (r14 >= r11) goto L282
            r1.writeByte(r6)
            int r14 = r14 + 1
            goto L2c4
        L2cc:
            if (r2 != 0) goto L2e1
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r8 = r0.mAttributes
            r8 = r8[r11]
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L2e1
            r8 = r3[r11]
            long r12 = (long) r8
            r1.writeUnsignedInt(r12)
            r12 = 0
            goto L2e6
        L2e1:
            r12 = 0
            r1.writeUnsignedInt(r12)
        L2e6:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r8 = r0.mAttributes
            r8 = r8[r2]
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L2f2:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L310
            java.lang.Object r10 = r8.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r10 = r10.getValue()
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r10
            byte[] r10 = r10.bytes
            int r14 = r10.length
            if (r14 <= r11) goto L2f2
            int r14 = r10.length
            r1.write(r10, r6, r14)
            goto L2f2
        L30e:
            r12 = 0
        L310:
            int r2 = r2 + 1
            goto L24d
        L314:
            boolean r2 = r0.mHasThumbnail
            if (r2 == 0) goto L31f
            byte[] r2 = r16.getThumbnailBytes()
            r1.write(r2)
        L31f:
            int r2 = r0.mMimeType
            if (r2 != r7) goto L32a
            int r2 = r4 % 2
            if (r2 != r5) goto L32a
            r1.writeByte(r6)
        L32a:
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            r1.setByteOrder(r2)
            return r4
    }

    public void flipHorizontally() {
            r3 = this;
            java.lang.String r0 = "Orientation"
            r1 = 1
            int r2 = r3.getAttributeInt(r0, r1)
            switch(r2) {
                case 1: goto L19;
                case 2: goto L1a;
                case 3: goto L17;
                case 4: goto L15;
                case 5: goto L13;
                case 6: goto L11;
                case 7: goto Le;
                case 8: goto Lc;
                default: goto La;
            }
        La:
            r1 = 0
            goto L1a
        Lc:
            r1 = 7
            goto L1a
        Le:
            r1 = 8
            goto L1a
        L11:
            r1 = 5
            goto L1a
        L13:
            r1 = 6
            goto L1a
        L15:
            r1 = 3
            goto L1a
        L17:
            r1 = 4
            goto L1a
        L19:
            r1 = 2
        L1a:
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r3.setAttribute(r0, r1)
            return
    }

    public void flipVertically() {
            r3 = this;
            java.lang.String r0 = "Orientation"
            r1 = 1
            int r2 = r3.getAttributeInt(r0, r1)
            switch(r2) {
                case 1: goto L19;
                case 2: goto L17;
                case 3: goto L15;
                case 4: goto L1a;
                case 5: goto L12;
                case 6: goto L10;
                case 7: goto Le;
                case 8: goto Lc;
                default: goto La;
            }
        La:
            r1 = 0
            goto L1a
        Lc:
            r1 = 5
            goto L1a
        Le:
            r1 = 6
            goto L1a
        L10:
            r1 = 7
            goto L1a
        L12:
            r1 = 8
            goto L1a
        L15:
            r1 = 2
            goto L1a
        L17:
            r1 = 3
            goto L1a
        L19:
            r1 = 4
        L1a:
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r3.setAttribute(r0, r1)
            return
    }

    public double getAltitude(double r8) {
            r7 = this;
            java.lang.String r0 = "GPSAltitude"
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r0 = r7.getAttributeDouble(r0, r1)
            java.lang.String r2 = "GPSAltitudeRef"
            r3 = -1
            int r2 = r7.getAttributeInt(r2, r3)
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L20
            if (r2 < 0) goto L20
            r8 = 1
            if (r2 != r8) goto L1b
            goto L1c
        L1b:
            r3 = 1
        L1c:
            double r8 = (double) r3
            double r0 = r0 * r8
            return r0
        L20:
            return r8
    }

    @androidx.annotation.Nullable
    public java.lang.String getAttribute(@androidx.annotation.NonNull java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "tag shouldn't be null"
            java.util.Objects.requireNonNull(r6, r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = r5.getExifAttribute(r6)
            r1 = 0
            if (r0 == 0) goto Lb3
            java.util.HashSet<java.lang.String> r2 = androidx.exifinterface.media.ExifInterface.sTagSetForCompatibility
            boolean r2 = r2.contains(r6)
            if (r2 != 0) goto L1c
            java.nio.ByteOrder r6 = r5.mExifByteOrder
            java.lang.String r6 = r0.getStringValue(r6)
            return r6
        L1c:
            java.lang.String r2 = "GPSTimeStamp"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto La8
            int r6 = r0.format
            r2 = 5
            java.lang.String r3 = "ExifInterface"
            if (r6 == r2) goto L42
            r2 = 10
            if (r6 == r2) goto L42
            java.lang.String r6 = "GPS Timestamp format is not rational. format="
            java.lang.StringBuilder r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            int r0 = r0.format
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r3, r6)
            return r1
        L42:
            java.nio.ByteOrder r6 = r5.mExifByteOrder
            java.lang.Object r6 = r0.getValue(r6)
            androidx.exifinterface.media.ExifInterface$Rational[] r6 = (androidx.exifinterface.media.ExifInterface.Rational[]) r6
            if (r6 == 0) goto L93
            int r0 = r6.length
            r2 = 3
            if (r0 == r2) goto L51
            goto L93
        L51:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1 = 0
            r2 = r6[r1]
            long r2 = r2.numerator
            float r2 = (float) r2
            r3 = r6[r1]
            long r3 = r3.denominator
            float r3 = (float) r3
            float r2 = r2 / r3
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 1
            r2 = r6[r1]
            long r2 = r2.numerator
            float r2 = (float) r2
            r3 = r6[r1]
            long r3 = r3.denominator
            float r3 = (float) r3
            float r2 = r2 / r3
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 2
            r2 = r6[r1]
            long r2 = r2.numerator
            float r2 = (float) r2
            r6 = r6[r1]
            long r3 = r6.denominator
            float r6 = (float) r3
            float r2 = r2 / r6
            int r6 = (int) r2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r1] = r6
            java.lang.String r6 = "%02d:%02d:%02d"
            java.lang.String r6 = java.lang.String.format(r6, r0)
            return r6
        L93:
            java.lang.String r0 = "Invalid GPS Timestamp array. array="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r6 = java.util.Arrays.toString(r6)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.w(r3, r6)
            return r1
        La8:
            java.nio.ByteOrder r6 = r5.mExifByteOrder     // Catch: java.lang.NumberFormatException -> Lb3
            double r2 = r0.getDoubleValue(r6)     // Catch: java.lang.NumberFormatException -> Lb3
            java.lang.String r6 = java.lang.Double.toString(r2)     // Catch: java.lang.NumberFormatException -> Lb3
            return r6
        Lb3:
            return r1
    }

    @androidx.annotation.Nullable
    public byte[] getAttributeBytes(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "tag shouldn't be null"
            java.util.Objects.requireNonNull(r2, r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = r1.getExifAttribute(r2)
            if (r2 == 0) goto Lf
            byte[] r2 = r2.bytes
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public double getAttributeDouble(@androidx.annotation.NonNull java.lang.String r2, double r3) {
            r1 = this;
            java.lang.String r0 = "tag shouldn't be null"
            java.util.Objects.requireNonNull(r2, r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = r1.getExifAttribute(r2)
            if (r2 != 0) goto Ld
            return r3
        Ld:
            java.nio.ByteOrder r0 = r1.mExifByteOrder     // Catch: java.lang.NumberFormatException -> L14
            double r2 = r2.getDoubleValue(r0)     // Catch: java.lang.NumberFormatException -> L14
            return r2
        L14:
            return r3
    }

    public int getAttributeInt(@androidx.annotation.NonNull java.lang.String r2, int r3) {
            r1 = this;
            java.lang.String r0 = "tag shouldn't be null"
            java.util.Objects.requireNonNull(r2, r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = r1.getExifAttribute(r2)
            if (r2 != 0) goto Ld
            return r3
        Ld:
            java.nio.ByteOrder r0 = r1.mExifByteOrder     // Catch: java.lang.NumberFormatException -> L14
            int r2 = r2.getIntValue(r0)     // Catch: java.lang.NumberFormatException -> L14
            return r2
        L14:
            return r3
    }

    @androidx.annotation.Nullable
    public long[] getAttributeRange(@androidx.annotation.NonNull java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "tag shouldn't be null"
            java.util.Objects.requireNonNull(r5, r0)
            boolean r0 = r4.mModified
            if (r0 != 0) goto L22
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = r4.getExifAttribute(r5)
            if (r5 == 0) goto L20
            r0 = 2
            long[] r0 = new long[r0]
            r1 = 0
            long r2 = r5.bytesOffset
            r0[r1] = r2
            r1 = 1
            byte[] r5 = r5.bytes
            int r5 = r5.length
            long r2 = (long) r5
            r0[r1] = r2
            return r0
        L20:
            r5 = 0
            return r5
        L22:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "The underlying file has been modified since being parsed"
            r5.<init>(r0)
            throw r5
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public long getDateTime() {
            r2 = this;
            java.lang.String r0 = "DateTime"
            java.lang.String r0 = r2.getAttribute(r0)
            java.lang.String r1 = "SubSecTime"
            java.lang.String r1 = r2.getAttribute(r1)
            long r0 = parseDateTime(r0, r1)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public long getDateTimeDigitized() {
            r2 = this;
            java.lang.String r0 = "DateTimeDigitized"
            java.lang.String r0 = r2.getAttribute(r0)
            java.lang.String r1 = "SubSecTimeDigitized"
            java.lang.String r1 = r2.getAttribute(r1)
            long r0 = parseDateTime(r0, r1)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public long getDateTimeOriginal() {
            r2 = this;
            java.lang.String r0 = "DateTimeOriginal"
            java.lang.String r0 = r2.getAttribute(r0)
            java.lang.String r1 = "SubSecTimeOriginal"
            java.lang.String r1 = r2.getAttribute(r1)
            long r0 = parseDateTime(r0, r1)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public long getGpsDateTime() {
            r6 = this;
            java.lang.String r0 = "GPSDateStamp"
            java.lang.String r0 = r6.getAttribute(r0)
            java.lang.String r1 = "GPSTimeStamp"
            java.lang.String r1 = r6.getAttribute(r1)
            r2 = -1
            if (r0 == 0) goto L51
            if (r1 == 0) goto L51
            java.util.regex.Pattern r4 = androidx.exifinterface.media.ExifInterface.sNonZeroTimePattern
            java.util.regex.Matcher r5 = r4.matcher(r0)
            boolean r5 = r5.matches()
            if (r5 != 0) goto L29
            java.util.regex.Matcher r4 = r4.matcher(r1)
            boolean r4 = r4.matches()
            if (r4 != 0) goto L29
            goto L51
        L29:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r0 = 32
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            java.text.ParsePosition r1 = new java.text.ParsePosition
            r4 = 0
            r1.<init>(r4)
            java.text.SimpleDateFormat r4 = androidx.exifinterface.media.ExifInterface.sFormatter     // Catch: java.lang.IllegalArgumentException -> L51
            java.util.Date r0 = r4.parse(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L51
            if (r0 != 0) goto L4c
            return r2
        L4c:
            long r0 = r0.getTime()     // Catch: java.lang.IllegalArgumentException -> L51
            return r0
        L51:
            return r2
    }

    @java.lang.Deprecated
    public boolean getLatLong(float[] r5) {
            r4 = this;
            double[] r0 = r4.getLatLong()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r2 = r0[r1]
            float r2 = (float) r2
            r5[r1] = r2
            r1 = 1
            r2 = r0[r1]
            float r0 = (float) r2
            r5[r1] = r0
            return r1
    }

    @androidx.annotation.Nullable
    public double[] getLatLong() {
            r12 = this;
            java.lang.String r0 = "GPSLatitude"
            java.lang.String r0 = r12.getAttribute(r0)
            java.lang.String r1 = "GPSLatitudeRef"
            java.lang.String r1 = r12.getAttribute(r1)
            java.lang.String r2 = "GPSLongitude"
            java.lang.String r2 = r12.getAttribute(r2)
            java.lang.String r3 = "GPSLongitudeRef"
            java.lang.String r3 = r12.getAttribute(r3)
            if (r0 == 0) goto L56
            if (r1 == 0) goto L56
            if (r2 == 0) goto L56
            if (r3 == 0) goto L56
            r4 = 2
            r5 = 1
            r6 = 0
            double r7 = convertRationalLatLonToDouble(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L32
            double r9 = convertRationalLatLonToDouble(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L32
            double[] r11 = new double[r4]     // Catch: java.lang.IllegalArgumentException -> L32
            r11[r6] = r7     // Catch: java.lang.IllegalArgumentException -> L32
            r11[r5] = r9     // Catch: java.lang.IllegalArgumentException -> L32
            return r11
        L32:
            java.lang.String r7 = "Latitude/longitude values are not parsable. "
            java.lang.StringBuilder r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7)
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r6] = r0
            r8[r5] = r1
            r8[r4] = r2
            r0 = 3
            r8[r0] = r3
            java.lang.String r0 = "latValue=%s, latRef=%s, lngValue=%s, lngRef=%s"
            java.lang.String r0 = java.lang.String.format(r0, r8)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.w(r1, r0)
        L56:
            r0 = 0
            return r0
    }

    public int getRotationDegrees() {
            r2 = this;
            java.lang.String r0 = "Orientation"
            r1 = 1
            int r0 = r2.getAttributeInt(r0, r1)
            switch(r0) {
                case 3: goto L12;
                case 4: goto L12;
                case 5: goto Lf;
                case 6: goto Lc;
                case 7: goto Lc;
                case 8: goto Lf;
                default: goto La;
            }
        La:
            r0 = 0
            return r0
        Lc:
            r0 = 90
            return r0
        Lf:
            r0 = 270(0x10e, float:3.78E-43)
            return r0
        L12:
            r0 = 180(0xb4, float:2.52E-43)
            return r0
    }

    @androidx.annotation.Nullable
    public byte[] getThumbnail() {
            r2 = this;
            int r0 = r2.mThumbnailCompression
            r1 = 6
            if (r0 == r1) goto Lb
            r1 = 7
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            byte[] r0 = r2.getThumbnailBytes()
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.Bitmap getThumbnailBitmap() {
            r9 = this;
            boolean r0 = r9.mHasThumbnail
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            byte[] r0 = r9.mThumbnailBytes
            if (r0 != 0) goto L10
            byte[] r0 = r9.getThumbnailBytes()
            r9.mThumbnailBytes = r0
        L10:
            int r0 = r9.mThumbnailCompression
            r2 = 6
            r3 = 0
            if (r0 == r2) goto L72
            r2 = 7
            if (r0 != r2) goto L1a
            goto L72
        L1a:
            r2 = 1
            if (r0 != r2) goto L71
            byte[] r0 = r9.mThumbnailBytes
            int r0 = r0.length
            int r0 = r0 / 3
            int[] r2 = new int[r0]
            r4 = 0
        L25:
            if (r4 >= r0) goto L41
            byte[] r5 = r9.mThumbnailBytes
            int r6 = r4 * 3
            r7 = r5[r6]
            int r7 = r7 << 16
            int r7 = r7 + r3
            int r8 = r6 + 1
            r8 = r5[r8]
            int r8 = r8 << 8
            int r7 = r7 + r8
            int r6 = r6 + 2
            r5 = r5[r6]
            int r7 = r7 + r5
            r2[r4] = r7
            int r4 = r4 + 1
            goto L25
        L41:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r9.mAttributes
            r3 = 4
            r0 = r0[r3]
            java.lang.String r4 = "ImageLength"
            java.lang.Object r0 = r0.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r9.mAttributes
            r3 = r4[r3]
            java.lang.String r4 = "ImageWidth"
            java.lang.Object r3 = r3.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            if (r0 == 0) goto L71
            if (r3 == 0) goto L71
            java.nio.ByteOrder r1 = r9.mExifByteOrder
            int r0 = r0.getIntValue(r1)
            java.nio.ByteOrder r1 = r9.mExifByteOrder
            int r1 = r3.getIntValue(r1)
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0, r3)
            return r0
        L71:
            return r1
        L72:
            byte[] r0 = r9.mThumbnailBytes
            int r1 = r9.mThumbnailLength
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r3, r1)
            return r0
    }

    @androidx.annotation.Nullable
    public byte[] getThumbnailBytes() {
            r11 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r11.mHasThumbnail
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            byte[] r1 = r11.mThumbnailBytes
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.content.res.AssetManager$AssetInputStream r1 = r11.mAssetInputStream     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            if (r1 == 0) goto L2e
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            if (r3 == 0) goto L1c
            r1.reset()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
        L1a:
            r3 = r2
            goto L5c
        L1c:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            closeQuietly(r1)
            return r2
        L25:
            r0 = move-exception
            r3 = r2
            goto Laf
        L29:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto La0
        L2e:
            java.lang.String r1 = r11.mFilename     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            if (r1 == 0) goto L3a
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.String r3 = r11.mFilename     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            goto L1a
        L3a:
            java.io.FileDescriptor r1 = r11.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            if (r1 == 0) goto L5a
            java.io.FileDescriptor r1 = android.system.Os.dup(r1)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            r3 = 0
            int r5 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
            android.system.Os.lseek(r1, r3, r5)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
            r10 = r3
            r3 = r1
            r1 = r10
            goto L5c
        L52:
            r0 = move-exception
            r3 = r1
            goto Lb0
        L55:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
            goto La0
        L5a:
            r1 = r2
            r3 = r1
        L5c:
            if (r1 == 0) goto L93
            int r4 = r11.mThumbnailOffset     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> Lae
            long r4 = (long) r4     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> Lae
            long r4 = r1.skip(r4)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> Lae
            int r6 = r11.mThumbnailOffset     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> Lae
            long r6 = (long) r6
            java.lang.String r8 = "Corrupted image"
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L8b
            int r4 = r11.mThumbnailLength     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> Lae
            byte[] r4 = new byte[r4]     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> Lae
            int r5 = r1.read(r4)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> Lae
            int r6 = r11.mThumbnailLength     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> Lae
            if (r5 != r6) goto L85
            r11.mThumbnailBytes = r4     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> Lae
            closeQuietly(r1)
            if (r3 == 0) goto L84
            closeFileDescriptor(r3)
        L84:
            return r4
        L85:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> Lae
            r4.<init>(r8)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> Lae
            throw r4     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> Lae
        L8b:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> Lae
            r4.<init>(r8)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> Lae
            throw r4     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> Lae
        L91:
            r4 = move-exception
            goto La0
        L93:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> Lae
            r4.<init>()     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> Lae
            throw r4     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> Lae
        L99:
            r0 = move-exception
            r3 = r2
            goto Lb0
        L9c:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
        La0:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> Lae
            closeQuietly(r1)
            if (r3 == 0) goto Lad
            closeFileDescriptor(r3)
        Lad:
            return r2
        Lae:
            r0 = move-exception
        Laf:
            r2 = r1
        Lb0:
            closeQuietly(r2)
            if (r3 == 0) goto Lb8
            closeFileDescriptor(r3)
        Lb8:
            throw r0
    }

    @androidx.annotation.Nullable
    public long[] getThumbnailRange() {
            r4 = this;
            boolean r0 = r4.mModified
            if (r0 != 0) goto L23
            boolean r0 = r4.mHasThumbnail
            r1 = 0
            if (r0 == 0) goto L22
            boolean r0 = r4.mHasThumbnailStrips
            if (r0 == 0) goto L12
            boolean r0 = r4.mAreThumbnailStripsConsecutive
            if (r0 != 0) goto L12
            return r1
        L12:
            r0 = 2
            long[] r0 = new long[r0]
            r1 = 0
            int r2 = r4.mThumbnailOffset
            long r2 = (long) r2
            r0[r1] = r2
            r1 = 1
            int r2 = r4.mThumbnailLength
            long r2 = (long) r2
            r0[r1] = r2
            return r0
        L22:
            return r1
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The underlying file has been modified since being parsed"
            r0.<init>(r1)
            throw r0
    }

    public boolean hasAttribute(@androidx.annotation.NonNull java.lang.String r1) {
            r0 = this;
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = r0.getExifAttribute(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public boolean hasThumbnail() {
            r1 = this;
            boolean r0 = r1.mHasThumbnail
            return r0
    }

    public boolean isFlipped() {
            r3 = this;
            java.lang.String r0 = "Orientation"
            r1 = 1
            int r0 = r3.getAttributeInt(r0, r1)
            r2 = 2
            if (r0 == r2) goto L15
            r2 = 7
            if (r0 == r2) goto L15
            r2 = 4
            if (r0 == r2) goto L15
            r2 = 5
            if (r0 == r2) goto L15
            r0 = 0
            return r0
        L15:
            return r1
    }

    public boolean isThumbnailCompressed() {
            r3 = this;
            boolean r0 = r3.mHasThumbnail
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r3.mThumbnailCompression
            r2 = 6
            if (r0 == r2) goto L10
            r2 = 7
            if (r0 != r2) goto Lf
            goto L10
        Lf:
            return r1
        L10:
            r0 = 1
            return r0
    }

    public void resetOrientation() {
            r2 = this;
            r0 = 1
            java.lang.String r0 = java.lang.Integer.toString(r0)
            java.lang.String r1 = "Orientation"
            r2.setAttribute(r1, r0)
            return
    }

    public void rotate(int r7) {
            r6 = this;
            int r0 = r7 % 90
            if (r0 != 0) goto L62
            r0 = 1
            java.lang.String r1 = "Orientation"
            int r0 = r6.getAttributeInt(r1, r0)
            java.util.List<java.lang.Integer> r2 = androidx.exifinterface.media.ExifInterface.ROTATION_ORDER
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r3 = r2.contains(r3)
            r4 = 0
            r5 = 4
            if (r3 == 0) goto L34
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r2.indexOf(r0)
            int r7 = r7 / 90
            int r7 = r7 + r0
            int r7 = r7 % r5
            if (r7 >= 0) goto L28
            r4 = 4
        L28:
            int r7 = r7 + r4
            java.lang.Object r7 = r2.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r4 = r7.intValue()
            goto L5a
        L34:
            java.util.List<java.lang.Integer> r2 = androidx.exifinterface.media.ExifInterface.FLIPPED_ROTATION_ORDER
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L5a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r2.indexOf(r0)
            int r7 = r7 / 90
            int r7 = r7 + r0
            int r7 = r7 % r5
            if (r7 >= 0) goto L4f
            r4 = 4
        L4f:
            int r7 = r7 + r4
            java.lang.Object r7 = r2.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r4 = r7.intValue()
        L5a:
            java.lang.String r7 = java.lang.Integer.toString(r4)
            r6.setAttribute(r1, r7)
            return
        L62:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "degree should be a multiple of 90"
            r7.<init>(r0)
            throw r7
    }

    public void saveAttributes() throws java.io.IOException {
            r8 = this;
            boolean r0 = r8.isSupportedFormatForSavingAttributes()
            if (r0 == 0) goto L15a
            java.io.FileDescriptor r0 = r8.mSeekableFileDescriptor
            if (r0 != 0) goto L17
            java.lang.String r0 = r8.mFilename
            if (r0 == 0) goto Lf
            goto L17
        Lf:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes for the current input."
            r0.<init>(r1)
            throw r0
        L17:
            r0 = 1
            r8.mModified = r0
            byte[] r0 = r8.getThumbnail()
            r8.mThumbnailBytes = r0
            java.lang.String r0 = r8.mFilename
            r1 = 0
            if (r0 == 0) goto L2d
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r8.mFilename
            r0.<init>(r2)
            goto L2e
        L2d:
            r0 = r1
        L2e:
            java.lang.String r2 = r8.mFilename     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            r3 = 0
            if (r2 == 0) goto L6f
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            r5.<init>()     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            java.lang.String r6 = r8.mFilename     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            r5.append(r6)     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            java.lang.String r6 = ".tmp"
            r5.append(r6)     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            boolean r5 = r0.renameTo(r2)     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            if (r5 == 0) goto L54
            r5 = r1
            goto La4
        L54:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            r3.<init>()     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            java.lang.String r4 = "Couldn't rename to "
            r3.append(r4)     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            r3.append(r2)     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            throw r0     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
        L6f:
            java.io.FileDescriptor r2 = r8.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            if (r2 == 0) goto La2
            java.lang.String r2 = "temp"
            java.lang.String r5 = "tmp"
            java.io.File r2 = java.io.File.createTempFile(r2, r5)     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            java.io.FileDescriptor r5 = r8.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            int r6 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            android.system.Os.lseek(r5, r3, r6)     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            java.io.FileDescriptor r6 = r8.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9d
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9d
            copy(r5, r6)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            goto La5
        L94:
            r0 = move-exception
            goto L9a
        L96:
            r0 = move-exception
            goto L9f
        L98:
            r0 = move-exception
            r6 = r1
        L9a:
            r1 = r5
            goto L153
        L9d:
            r0 = move-exception
            r6 = r1
        L9f:
            r1 = r5
            goto L14a
        La2:
            r2 = r1
            r5 = r2
        La4:
            r6 = r5
        La5:
            closeQuietly(r5)
            closeQuietly(r6)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L108 java.lang.Exception -> L10b
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L108 java.lang.Exception -> L10b
            java.lang.String r6 = r8.mFilename     // Catch: java.lang.Throwable -> L108 java.lang.Exception -> L10b
            if (r6 == 0) goto Lbc
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L108 java.lang.Exception -> L10b
            java.lang.String r4 = r8.mFilename     // Catch: java.lang.Throwable -> L108 java.lang.Exception -> L10b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L108 java.lang.Exception -> L10b
            goto Lce
        Lbc:
            java.io.FileDescriptor r6 = r8.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> L108 java.lang.Exception -> L10b
            if (r6 == 0) goto Lcd
            int r7 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L108 java.lang.Exception -> L10b
            android.system.Os.lseek(r6, r3, r7)     // Catch: java.lang.Throwable -> L108 java.lang.Exception -> L10b
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L108 java.lang.Exception -> L10b
            java.io.FileDescriptor r4 = r8.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> L108 java.lang.Exception -> L10b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L108 java.lang.Exception -> L10b
            goto Lce
        Lcd:
            r3 = r1
        Lce:
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L108 java.lang.Exception -> L10b
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L108 java.lang.Exception -> L10b
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L100 java.lang.Exception -> L104
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L100 java.lang.Exception -> L104
            int r3 = r8.mMimeType     // Catch: java.lang.Throwable -> Lfc java.lang.Exception -> Lfe
            r6 = 4
            if (r3 != r6) goto Le1
            r8.saveJpegAttributes(r4, r5)     // Catch: java.lang.Throwable -> Lfc java.lang.Exception -> Lfe
            goto Lf0
        Le1:
            r6 = 13
            if (r3 != r6) goto Le9
            r8.savePngAttributes(r4, r5)     // Catch: java.lang.Throwable -> Lfc java.lang.Exception -> Lfe
            goto Lf0
        Le9:
            r6 = 14
            if (r3 != r6) goto Lf0
            r8.saveWebpAttributes(r4, r5)     // Catch: java.lang.Throwable -> Lfc java.lang.Exception -> Lfe
        Lf0:
            closeQuietly(r4)
            closeQuietly(r5)
            r2.delete()
            r8.mThumbnailBytes = r1
            return
        Lfc:
            r0 = move-exception
            goto L102
        Lfe:
            r3 = move-exception
            goto L106
        L100:
            r0 = move-exception
            r5 = r1
        L102:
            r1 = r4
            goto L13b
        L104:
            r3 = move-exception
            r5 = r1
        L106:
            r1 = r4
            goto L10d
        L108:
            r0 = move-exception
            r5 = r1
            goto L13b
        L10b:
            r3 = move-exception
            r5 = r1
        L10d:
            java.lang.String r4 = r8.mFilename     // Catch: java.lang.Throwable -> L13a
            if (r4 == 0) goto L132
            boolean r4 = r2.renameTo(r0)     // Catch: java.lang.Throwable -> L13a
            if (r4 != 0) goto L132
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L13a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13a
            r4.<init>()     // Catch: java.lang.Throwable -> L13a
            java.lang.String r6 = "Couldn't restore original file: "
            r4.append(r6)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L13a
            r4.append(r0)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L13a
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L13a
            throw r3     // Catch: java.lang.Throwable -> L13a
        L132:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L13a
            java.lang.String r4 = "Failed to save new file"
            r0.<init>(r4, r3)     // Catch: java.lang.Throwable -> L13a
            throw r0     // Catch: java.lang.Throwable -> L13a
        L13a:
            r0 = move-exception
        L13b:
            closeQuietly(r1)
            closeQuietly(r5)
            r2.delete()
            throw r0
        L145:
            r0 = move-exception
            r6 = r1
            goto L153
        L148:
            r0 = move-exception
            r6 = r1
        L14a:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L152
            java.lang.String r3 = "Failed to copy original file to temp file"
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L152
            throw r2     // Catch: java.lang.Throwable -> L152
        L152:
            r0 = move-exception
        L153:
            closeQuietly(r1)
            closeQuietly(r6)
            throw r0
        L15a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface only supports saving attributes on JPEG, PNG, or WebP formats."
            r0.<init>(r1)
            throw r0
    }

    public void setAltitude(double r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L9
            java.lang.String r0 = "0"
            goto Lb
        L9:
            java.lang.String r0 = "1"
        Lb:
            androidx.exifinterface.media.ExifInterface$Rational r1 = new androidx.exifinterface.media.ExifInterface$Rational
            double r4 = java.lang.Math.abs(r4)
            r1.<init>(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r5 = "GPSAltitude"
            r3.setAttribute(r5, r4)
            java.lang.String r4 = "GPSAltitudeRef"
            r3.setAttribute(r4, r0)
            return
    }

    public void setAttribute(@androidx.annotation.NonNull java.lang.String r14, @androidx.annotation.Nullable java.lang.String r15) {
            r13 = this;
            java.lang.String r0 = "tag shouldn't be null"
            java.util.Objects.requireNonNull(r14, r0)
            java.lang.String r0 = "ISOSpeedRatings"
            boolean r0 = r0.equals(r14)
            java.lang.String r1 = "ExifInterface"
            if (r0 == 0) goto L1c
            boolean r14 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r14 == 0) goto L1a
            java.lang.String r14 = "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."
            android.util.Log.d(r1, r14)
        L1a:
            java.lang.String r14 = "PhotographicSensitivity"
        L1c:
            r0 = 2
            r2 = 1
            if (r15 == 0) goto Lb9
            java.util.HashSet<java.lang.String> r3 = androidx.exifinterface.media.ExifInterface.sTagSetForCompatibility
            boolean r3 = r3.contains(r14)
            if (r3 == 0) goto Lb9
            java.lang.String r3 = "GPSTimeStamp"
            boolean r3 = r14.equals(r3)
            java.lang.String r4 = " : "
            java.lang.String r5 = "Invalid value for "
            if (r3 == 0) goto L92
            java.util.regex.Pattern r3 = androidx.exifinterface.media.ExifInterface.sGpsTimestampPattern
            java.util.regex.Matcher r3 = r3.matcher(r15)
            boolean r6 = r3.find()
            if (r6 != 0) goto L59
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r14)
            r0.append(r4)
            r0.append(r15)
            java.lang.String r14 = r0.toString()
            android.util.Log.w(r1, r14)
            return
        L59:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r4 = r3.group(r2)
            int r4 = java.lang.Integer.parseInt(r4)
            r15.append(r4)
            java.lang.String r4 = "/1,"
            r15.append(r4)
            java.lang.String r5 = r3.group(r0)
            int r5 = java.lang.Integer.parseInt(r5)
            r15.append(r5)
            r15.append(r4)
            r4 = 3
            java.lang.String r3 = r3.group(r4)
            int r3 = java.lang.Integer.parseInt(r3)
            r15.append(r3)
            java.lang.String r3 = "/1"
            r15.append(r3)
            java.lang.String r15 = r15.toString()
            goto Lb9
        L92:
            double r6 = java.lang.Double.parseDouble(r15)     // Catch: java.lang.NumberFormatException -> La0
            androidx.exifinterface.media.ExifInterface$Rational r3 = new androidx.exifinterface.media.ExifInterface$Rational     // Catch: java.lang.NumberFormatException -> La0
            r3.<init>(r6)     // Catch: java.lang.NumberFormatException -> La0
            java.lang.String r15 = r3.toString()     // Catch: java.lang.NumberFormatException -> La0
            goto Lb9
        La0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r14)
            r0.append(r4)
            r0.append(r15)
            java.lang.String r14 = r0.toString()
            android.util.Log.w(r1, r14)
            return
        Lb9:
            r3 = 0
            r4 = 0
        Lbb:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r5 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r5 = r5.length
            if (r4 >= r5) goto L2e7
            r5 = 4
            if (r4 != r5) goto Lc9
            boolean r5 = r13.mHasThumbnail
            if (r5 != 0) goto Lc9
            goto L2e0
        Lc9:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifTag>[] r5 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForWriting
            r5 = r5[r4]
            java.lang.Object r5 = r5.get(r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = (androidx.exifinterface.media.ExifInterface.ExifTag) r5
            if (r5 == 0) goto L2e0
            if (r15 != 0) goto Le0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r13.mAttributes
            r0 = r0[r4]
            r0.remove(r14)
            goto L2e0
        Le0:
            android.util.Pair r6 = guessDataFormat(r15)
            int r7 = r5.primaryFormat
            java.lang.Object r8 = r6.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r9 = -1
            if (r7 == r8) goto L19e
            int r7 = r5.primaryFormat
            java.lang.Object r8 = r6.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r7 != r8) goto Lff
            goto L19e
        Lff:
            int r7 = r5.secondaryFormat
            if (r7 == r9) goto L11d
            java.lang.Object r8 = r6.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r7 == r8) goto L119
            int r7 = r5.secondaryFormat
            java.lang.Object r8 = r6.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r7 != r8) goto L11d
        L119:
            int r0 = r5.secondaryFormat
            goto L1a0
        L11d:
            int r7 = r5.primaryFormat
            if (r7 == r2) goto L19c
            r8 = 7
            if (r7 == r8) goto L19c
            if (r7 != r0) goto L128
            goto L19c
        L128:
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto L2e0
            java.lang.String r0 = "Given tag ("
            java.lang.String r2 = ") value didn't match with one of expected formats: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r0, r14, r2)
            java.lang.String[] r2 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_NAMES
            int r3 = r5.primaryFormat
            r3 = r2[r3]
            r0.append(r3)
            int r3 = r5.secondaryFormat
            java.lang.String r7 = ""
            java.lang.String r8 = ", "
            if (r3 != r9) goto L147
            r3 = r7
            goto L156
        L147:
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8)
            int r5 = r5.secondaryFormat
            r5 = r2[r5]
            r3.append(r5)
            java.lang.String r3 = r3.toString()
        L156:
            r0.append(r3)
            java.lang.String r3 = " (guess: "
            r0.append(r3)
            java.lang.Object r3 = r6.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r3 = r2[r3]
            r0.append(r3)
            java.lang.Object r3 = r6.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != r9) goto L176
            goto L18b
        L176:
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8)
            java.lang.Object r5 = r6.second
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2 = r2[r5]
            r3.append(r2)
            java.lang.String r7 = r3.toString()
        L18b:
            r0.append(r7)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
            goto L2e0
        L19c:
            r0 = r7
            goto L1a0
        L19e:
            int r0 = r5.primaryFormat
        L1a0:
            java.lang.String r5 = "/"
            java.lang.String r6 = ","
            switch(r0) {
                case 1: goto L2d5;
                case 2: goto L2c9;
                case 3: goto L2a4;
                case 4: goto L27f;
                case 5: goto L245;
                case 6: goto L1a7;
                case 7: goto L2c9;
                case 8: goto L1a7;
                case 9: goto L220;
                case 10: goto L1e6;
                case 11: goto L1a7;
                case 12: goto L1c1;
                default: goto L1a7;
            }
        L1a7:
            boolean r2 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r2 == 0) goto L2e0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Data format isn't one of expected formats: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
            goto L2e0
        L1c1:
            java.lang.String[] r0 = r15.split(r6, r9)
            int r2 = r0.length
            double[] r2 = new double[r2]
            r3 = 0
        L1c9:
            int r5 = r0.length
            if (r3 >= r5) goto L1d7
            r5 = r0[r3]
            double r5 = java.lang.Double.parseDouble(r5)
            r2[r3] = r5
            int r3 = r3 + 1
            goto L1c9
        L1d7:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r13.mAttributes
            r0 = r0[r4]
            java.nio.ByteOrder r3 = r13.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createDouble(r2, r3)
            r0.put(r14, r2)
            goto L2e0
        L1e6:
            java.lang.String[] r0 = r15.split(r6, r9)
            int r6 = r0.length
            androidx.exifinterface.media.ExifInterface$Rational[] r6 = new androidx.exifinterface.media.ExifInterface.Rational[r6]
            r7 = 0
        L1ee:
            int r8 = r0.length
            if (r7 >= r8) goto L211
            r8 = r0[r7]
            java.lang.String[] r8 = r8.split(r5, r9)
            androidx.exifinterface.media.ExifInterface$Rational r10 = new androidx.exifinterface.media.ExifInterface$Rational
            r3 = r8[r3]
            double r11 = java.lang.Double.parseDouble(r3)
            long r11 = (long) r11
            r2 = r8[r2]
            double r2 = java.lang.Double.parseDouble(r2)
            long r2 = (long) r2
            r10.<init>(r11, r2)
            r6[r7] = r10
            int r7 = r7 + 1
            r2 = 1
            r3 = 0
            goto L1ee
        L211:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r13.mAttributes
            r0 = r0[r4]
            java.nio.ByteOrder r2 = r13.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createSRational(r6, r2)
            r0.put(r14, r2)
            goto L2e0
        L220:
            java.lang.String[] r0 = r15.split(r6, r9)
            int r2 = r0.length
            int[] r2 = new int[r2]
            r3 = 0
        L228:
            int r5 = r0.length
            if (r3 >= r5) goto L236
            r5 = r0[r3]
            int r5 = java.lang.Integer.parseInt(r5)
            r2[r3] = r5
            int r3 = r3 + 1
            goto L228
        L236:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r13.mAttributes
            r0 = r0[r4]
            java.nio.ByteOrder r3 = r13.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createSLong(r2, r3)
            r0.put(r14, r2)
            goto L2e0
        L245:
            java.lang.String[] r0 = r15.split(r6, r9)
            int r2 = r0.length
            androidx.exifinterface.media.ExifInterface$Rational[] r2 = new androidx.exifinterface.media.ExifInterface.Rational[r2]
            r3 = 0
        L24d:
            int r6 = r0.length
            if (r3 >= r6) goto L271
            r6 = r0[r3]
            java.lang.String[] r6 = r6.split(r5, r9)
            androidx.exifinterface.media.ExifInterface$Rational r7 = new androidx.exifinterface.media.ExifInterface$Rational
            r8 = 0
            r8 = r6[r8]
            double r8 = java.lang.Double.parseDouble(r8)
            long r8 = (long) r8
            r10 = 1
            r6 = r6[r10]
            double r10 = java.lang.Double.parseDouble(r6)
            long r10 = (long) r10
            r7.<init>(r8, r10)
            r2[r3] = r7
            int r3 = r3 + 1
            r9 = -1
            goto L24d
        L271:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r13.mAttributes
            r0 = r0[r4]
            java.nio.ByteOrder r3 = r13.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createURational(r2, r3)
            r0.put(r14, r2)
            goto L2e0
        L27f:
            r0 = -1
            java.lang.String[] r0 = r15.split(r6, r0)
            int r2 = r0.length
            long[] r2 = new long[r2]
            r3 = 0
        L288:
            int r5 = r0.length
            if (r3 >= r5) goto L296
            r5 = r0[r3]
            long r5 = java.lang.Long.parseLong(r5)
            r2[r3] = r5
            int r3 = r3 + 1
            goto L288
        L296:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r13.mAttributes
            r0 = r0[r4]
            java.nio.ByteOrder r3 = r13.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r2, r3)
            r0.put(r14, r2)
            goto L2e0
        L2a4:
            r0 = -1
            java.lang.String[] r0 = r15.split(r6, r0)
            int r2 = r0.length
            int[] r2 = new int[r2]
            r3 = 0
        L2ad:
            int r5 = r0.length
            if (r3 >= r5) goto L2bb
            r5 = r0[r3]
            int r5 = java.lang.Integer.parseInt(r5)
            r2[r3] = r5
            int r3 = r3 + 1
            goto L2ad
        L2bb:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r13.mAttributes
            r0 = r0[r4]
            java.nio.ByteOrder r3 = r13.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r2, r3)
            r0.put(r14, r2)
            goto L2e0
        L2c9:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r13.mAttributes
            r0 = r0[r4]
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createString(r15)
            r0.put(r14, r2)
            goto L2e0
        L2d5:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r13.mAttributes
            r0 = r0[r4]
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createByte(r15)
            r0.put(r14, r2)
        L2e0:
            int r4 = r4 + 1
            r0 = 2
            r2 = 1
            r3 = 0
            goto Lbb
        L2e7:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void setDateTime(long r5) {
            r4 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r5 % r0
            java.text.SimpleDateFormat r2 = androidx.exifinterface.media.ExifInterface.sFormatter
            java.util.Date r3 = new java.util.Date
            r3.<init>(r5)
            java.lang.String r5 = r2.format(r3)
            java.lang.String r6 = "DateTime"
            r4.setAttribute(r6, r5)
            java.lang.String r5 = java.lang.Long.toString(r0)
            java.lang.String r6 = "SubSecTime"
            r4.setAttribute(r6, r5)
            return
    }

    public void setGpsInfo(android.location.Location r6) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r6.getProvider()
            java.lang.String r1 = "GPSProcessingMethod"
            r5.setAttribute(r1, r0)
            double r0 = r6.getLatitude()
            double r2 = r6.getLongitude()
            r5.setLatLong(r0, r2)
            double r0 = r6.getAltitude()
            r5.setAltitude(r0)
            java.lang.String r0 = "GPSSpeedRef"
            java.lang.String r1 = "K"
            r5.setAttribute(r0, r1)
            androidx.exifinterface.media.ExifInterface$Rational r0 = new androidx.exifinterface.media.ExifInterface$Rational
            float r1 = r6.getSpeed()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            r3 = 1
            long r2 = r2.toSeconds(r3)
            float r2 = (float) r2
            float r1 = r1 * r2
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r2
            double r1 = (double) r1
            r0.<init>(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GPSSpeed"
            r5.setAttribute(r1, r0)
            java.text.SimpleDateFormat r0 = androidx.exifinterface.media.ExifInterface.sFormatter
            java.util.Date r1 = new java.util.Date
            long r2 = r6.getTime()
            r1.<init>(r2)
            java.lang.String r6 = r0.format(r1)
            r0 = -1
            java.lang.String r1 = "\\s+"
            java.lang.String[] r6 = r6.split(r1, r0)
            r0 = 0
            r0 = r6[r0]
            java.lang.String r1 = "GPSDateStamp"
            r5.setAttribute(r1, r0)
            r0 = 1
            r6 = r6[r0]
            java.lang.String r0 = "GPSTimeStamp"
            r5.setAttribute(r0, r6)
            return
    }

    public void setLatLong(double r5, double r7) {
            r4 = this;
            java.lang.String r0 = " is not valid."
            r1 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 < 0) goto L85
            r1 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 > 0) goto L85
            boolean r1 = java.lang.Double.isNaN(r5)
            if (r1 != 0) goto L85
            r1 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 < 0) goto L6b
            r1 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 > 0) goto L6b
            boolean r1 = java.lang.Double.isNaN(r7)
            if (r1 != 0) goto L6b
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L3b
            java.lang.String r2 = "N"
            goto L3d
        L3b:
            java.lang.String r2 = "S"
        L3d:
            java.lang.String r3 = "GPSLatitudeRef"
            r4.setAttribute(r3, r2)
            double r5 = java.lang.Math.abs(r5)
            java.lang.String r5 = r4.convertDecimalDegree(r5)
            java.lang.String r6 = "GPSLatitude"
            r4.setAttribute(r6, r5)
            int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r5 < 0) goto L56
            java.lang.String r5 = "E"
            goto L58
        L56:
            java.lang.String r5 = "W"
        L58:
            java.lang.String r6 = "GPSLongitudeRef"
            r4.setAttribute(r6, r5)
            double r5 = java.lang.Math.abs(r7)
            java.lang.String r5 = r4.convertDecimalDegree(r5)
            java.lang.String r6 = "GPSLongitude"
            r4.setAttribute(r6, r5)
            return
        L6b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Longitude value "
            r6.append(r1)
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L85:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "Latitude value "
            r8.append(r1)
            r8.append(r5)
            r8.append(r0)
            java.lang.String r5 = r8.toString()
            r7.<init>(r5)
            throw r7
    }
}
