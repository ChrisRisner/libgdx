/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btOptimizedBvhNodeFloatData extends BulletBase {
	private long swigCPtr;
	
	protected btOptimizedBvhNodeFloatData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btOptimizedBvhNodeFloatData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btOptimizedBvhNodeFloatData(long cPtr, boolean cMemoryOwn) {
		this("btOptimizedBvhNodeFloatData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btOptimizedBvhNodeFloatData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btOptimizedBvhNodeFloatData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setAabbMinOrg(btVector3FloatData value) {
    CollisionJNI.btOptimizedBvhNodeFloatData_aabbMinOrg_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getAabbMinOrg() {
    long cPtr = CollisionJNI.btOptimizedBvhNodeFloatData_aabbMinOrg_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setAabbMaxOrg(btVector3FloatData value) {
    CollisionJNI.btOptimizedBvhNodeFloatData_aabbMaxOrg_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getAabbMaxOrg() {
    long cPtr = CollisionJNI.btOptimizedBvhNodeFloatData_aabbMaxOrg_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setEscapeIndex(int value) {
    CollisionJNI.btOptimizedBvhNodeFloatData_escapeIndex_set(swigCPtr, this, value);
  }

  public int getEscapeIndex() {
    return CollisionJNI.btOptimizedBvhNodeFloatData_escapeIndex_get(swigCPtr, this);
  }

  public void setSubPart(int value) {
    CollisionJNI.btOptimizedBvhNodeFloatData_subPart_set(swigCPtr, this, value);
  }

  public int getSubPart() {
    return CollisionJNI.btOptimizedBvhNodeFloatData_subPart_get(swigCPtr, this);
  }

  public void setTriangleIndex(int value) {
    CollisionJNI.btOptimizedBvhNodeFloatData_triangleIndex_set(swigCPtr, this, value);
  }

  public int getTriangleIndex() {
    return CollisionJNI.btOptimizedBvhNodeFloatData_triangleIndex_get(swigCPtr, this);
  }

  public void setPad(String value) {
    CollisionJNI.btOptimizedBvhNodeFloatData_pad_set(swigCPtr, this, value);
  }

  public String getPad() {
    return CollisionJNI.btOptimizedBvhNodeFloatData_pad_get(swigCPtr, this);
  }

  public btOptimizedBvhNodeFloatData() {
    this(CollisionJNI.new_btOptimizedBvhNodeFloatData(), true);
  }

}
