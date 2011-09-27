/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.xuggler;
import com.xuggle.ferry.*;
/**
 * Represents one raw (undecoded) picture in a video stream, plus a 
 * timestamp  
 * for when to display that video picture relative to other items in 
 * a {@link IContainer}.  
 * <p>  
 * All timestamps for this object are always in Microseconds.  
 * </p>  
 */
public class IVideoPicture extends IMediaData {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected IVideoPicture(long cPtr, boolean cMemoryOwn) {
    super(XugglerJNI.SWIGIVideoPictureUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected IVideoPicture(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(XugglerJNI.SWIGIVideoPictureUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  public static long getCPtr(IVideoPicture obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  public long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new IVideoPicture object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public IVideoPicture copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new IVideoPicture(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof IVideoPicture)
      equal = (((IVideoPicture)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  

  /**
   * info about this packet
   * @return information about this packet
   */
   
  @Override
  public String toString()
  {
    StringBuilder result = new StringBuilder();
    
    result.append(this.getClass().getName()+"@"+hashCode()+"[");
    result.append("pixel type:"+getPixelType()+";");
    result.append("width:"+getWidth()+";");
    result.append("height:"+getHeight()+";");
    result.append("time stamp:"+getTimeStamp()+";");
    result.append("complete:"+isComplete()+";");
    result.append("size:"+getSize()+";");
    result.append("key:"+isKey()+";");
    IRational timeBase = IRational.make(1,(int)Global.DEFAULT_PTS_PER_SECOND);
    result.append("time base:"+timeBase+";");
    if (timeBase != null) timeBase.delete();
    result.append("]");
    return result.toString();
  }


/**
 * Is this a key frame?  
 * @return	is this a key frame  
 */
  public boolean isKeyFrame() {
    return XugglerJNI.IVideoPicture_isKeyFrame(swigCPtr, this);
  }

/**
 * Reset if this is a key frame or not. Note that regardless of how 
 *  
 * this flag is set, an IVideoPicture always contains raw video data 
 * (hence the  
 * key setting isn't really that important).  
 * @param	aIsKey True if a key frame; false if not.  
 */
  public void setKeyFrame(boolean aIsKey) {
    XugglerJNI.IVideoPicture_setKeyFrame(swigCPtr, this, aIsKey);
  }

/**
 * Is this picture completely decoded?  
 * @return	is this picture completely decoded?  
 */
  public boolean isComplete() {
    return XugglerJNI.IVideoPicture_isComplete(swigCPtr, this);
  }

/**
 * Total size in bytes of the decoded picture.  
 * @return	number of bytes of decoded picture  
 */
  public int getSize() {
    return XugglerJNI.IVideoPicture_getSize(swigCPtr, this);
  }

/**
 * What is the width of the picture.  
 * @return	the width of the picture  
 */
  public int getWidth() {
    return XugglerJNI.IVideoPicture_getWidth(swigCPtr, this);
  }

/**
 * What is the height of the picture  
 * @return	the height of the picture  
 */
  public int getHeight() {
    return XugglerJNI.IVideoPicture_getHeight(swigCPtr, this);
  }

/**
 * Returns the pixel format of the picture.  
 * @return	the pixel format of the picture.  
 */
  public IPixelFormat.Type getPixelType() {
    return IPixelFormat.Type.swigToEnum(XugglerJNI.IVideoPicture_getPixelType(swigCPtr, this));
  }

/**
 * What is the Presentation Time Stamp (in Microseconds) of this picture. 
 *  
 * The PTS is is scaled so that 1 PTS =  
 * 1/1,000,000 of a second.  
 * @return	the presentation time stamp (pts)  
 */
  public long getPts() {
    return XugglerJNI.IVideoPicture_getPts(swigCPtr, this);
  }

/**
 * Set the Presentation Time Stamp (in Microseconds) for this picture. 
 *  
 * @see		#getPts()  
 * @param	value the new timestamp  
 */
  public void setPts(long value) {
    XugglerJNI.IVideoPicture_setPts(swigCPtr, this, value);
  }

/**
 * This value is the quality setting this VideoPicture had when it was 
 *  
 * decoded, or is the value to use when this picture is next  
 * encoded (if reset with setQuality()  
 * @return	The quality.  
 */
  public int getQuality() {
    return XugglerJNI.IVideoPicture_getQuality(swigCPtr, this);
  }

/**
 * Set the Quality to a new value. This will be used the  
 * next time this VideoPicture is encoded by a StreamCoder  
 * @param	newQuality The new quality.  
 */
  public void setQuality(int newQuality) {
    XugglerJNI.IVideoPicture_setQuality(swigCPtr, this, newQuality);
  }

/**
 * Return the size of each line in the VideoPicture data. Usually there 
 *  
 * are no more than 4 lines, but the first line no that returns 0  
 * is the end of the road.  
 * @param	lineNo The line you want to know the (byte) size of.  
 * @return	The size (in bytes) of that line in data.  
 */
  public int getDataLineSize(int lineNo) {
    return XugglerJNI.IVideoPicture_getDataLineSize(swigCPtr, this, lineNo);
  }

/**
 * After modifying the raw data in this buffer, call this function to 
 *  
 * let the object know it is now complete.  
 * @param	aIsComplete Is this VideoPicture complete  
 * @param	format The pixel format of the data in this picture. Must 
 *		 match  
 * what the picture was originally constructed with.  
 * @param	width The width of the data in this picture. Must match what 
 *		  
 * the picture was originally constructed with.  
 * @param	height The height of the data in this picture. Must match 
 *		 what  
 * the picture was originally constructed with.  
 * @param	pts The presentation timestamp of the picture that is now 
 *		 complete.  
 * The caller must ensure this PTS is in units of 1/1,000,000 seconds. 
 *  
 */
  public void setComplete(boolean aIsComplete, IPixelFormat.Type format, int width, int height, long pts) {
    XugglerJNI.IVideoPicture_setComplete(swigCPtr, this, aIsComplete, format.swigValue(), width, height, pts);
  }

/**
 * Copy the contents of the given picture into this picture. All  
 * buffers are copied by value, not be reference.  
 * @param	srcPicture The picture you want to copy.  
 * @return	true if a successful copy; false if not.  
 */
  public boolean copy(IVideoPicture srcPicture) {
    return XugglerJNI.IVideoPicture_copy(swigCPtr, this, IVideoPicture.getCPtr(srcPicture), srcPicture);
  }

/**
 * Get a new picture object.  
 * <p>  
 * You can specify -1 for width and height, in which case all getData() 
 * methods  
 * will return error until XUGGLER decodes something into this frame. 
 * In general  
 * you should always try to specify the width and height.  
 * </p>  
 * <p>  
 * Note that any buffers this objects needs will be  
 * lazily allocated (i.e. we won't actually grab all  
 * the memory until we need it).  
 * </p>  
 * <p>This is useful because  
 * it allows you to hold a IVideoPicture object that remembers  
 * things like format, width, and height, but know  
 * that it doesn't actually take up a lot of memory until  
 * the first time someone tries to access that memory.  
 * </p>  
 * @param	format The pixel format (for example, YUV420P).  
 * @param	width The width of the picture, in pixels, or -1 if you want 
 *		 XUGGLER to guess when decoding.  
 * @param	height The height of the picture, in pixels, or -1 if you 
 *		 want XUGGLER to guess when decoding.  
 * @return	A new object, or null if we can't allocate one.  
 */
  public static IVideoPicture make(IPixelFormat.Type format, int width, int height) {
    long cPtr = XugglerJNI.IVideoPicture_make__SWIG_0(format.swigValue(), width, height);
    return (cPtr == 0) ? null : new IVideoPicture(cPtr, false);
  }

/**
 * Get a new picture by copying the data in an existing frame.  
 * @param	src The picture to copy.  
 * @return	The new picture, or null on error.  
 */
  public static IVideoPicture make(IVideoPicture src) {
    long cPtr = XugglerJNI.IVideoPicture_make__SWIG_1(IVideoPicture.getCPtr(src), src);
    return (cPtr == 0) ? null : new IVideoPicture(cPtr, false);
  }

/**
 * Get the picture type.  
 * <p>  
 * This will be set on decoding to tell you what type of  
 * packet this was decoded from, and when encoding  
 * is a request to the encoder for how to encode the picture.  
 * </p>  
 * <p>  
 * The request may be ignored by your codec.  
 * </p>  
 * @return	the picture type.  
 */
  public IVideoPicture.PictType getPictureType() {
    return IVideoPicture.PictType.swigToEnum(XugglerJNI.IVideoPicture_getPictureType(swigCPtr, this));
  }

/**
 * Set the picture type.  
 * @param	type The type.  
 * @see		#getPictureType()  
 */
  public void setPictureType(IVideoPicture.PictType type) {
    XugglerJNI.IVideoPicture_setPictureType(swigCPtr, this, type.swigValue());
  }

/**
 * Get a new picture object, by wrapping an existing  
 * {@link com.xuggle.ferry.IBuffer}.  
 * <p>  
 * Use this method if you have existing video data that you want  
 * to have us wrap and pass to FFmpeg. Note that if decoding  
 * into this video picture and the decoded data actually takes more 
 *  
 * space than is in this buffer, this object will release the reference 
 *  
 * to the passed in buffer and allocate a new buffer instead so the 
 * decode  
 * can continue.  
 * </p>  
 * <p>  
 * Due to some decoders assembly optimizations, you should ensure the 
 *  
 * IBuffer you pass in has at least 8 more bytes than would typically 
 *  
 * be required based on the format, width and height.  
 * </p>  
 * @param	buffer The {@link com.xuggle.ferry.IBuffer} to wrap.  
 * @param	format The pixel format (for example, YUV420P).  
 * @param	width The width of the picture, in pixels.  
 * @param	height The height of the picture, in pixels.  
 * @return	A new object, or null if we can't allocate one.  
 */
  public static IVideoPicture make(IBuffer buffer, IPixelFormat.Type format, int width, int height) {
    long cPtr = XugglerJNI.IVideoPicture_make__SWIG_2(IBuffer.getCPtr(buffer), buffer, format.swigValue(), width, height);
    return (cPtr == 0) ? null : new IVideoPicture(cPtr, false);
  }

  public enum PictType {
  /**
   * The different types of images that we can set.
   * @see		#getPictureType()
   */
    DEFAULT_TYPE(XugglerJNI.IVideoPicture_DEFAULT_TYPE_get()),
    I_TYPE(XugglerJNI.IVideoPicture_I_TYPE_get()),
    P_TYPE(XugglerJNI.IVideoPicture_P_TYPE_get()),
    B_TYPE(XugglerJNI.IVideoPicture_B_TYPE_get()),
    S_TYPE(XugglerJNI.IVideoPicture_S_TYPE_get()),
    SI_TYPE(XugglerJNI.IVideoPicture_SI_TYPE_get()),
    SP_TYPE(XugglerJNI.IVideoPicture_SP_TYPE_get()),
    BI_TYPE(XugglerJNI.IVideoPicture_BI_TYPE_get());

    public final int swigValue() {
      return swigValue;
    }

    public static PictType swigToEnum(int swigValue) {
      PictType[] swigValues = PictType.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (PictType swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + PictType.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private PictType() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private PictType(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private PictType(PictType swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}