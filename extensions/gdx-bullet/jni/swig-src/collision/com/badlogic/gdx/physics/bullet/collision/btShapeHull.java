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

public class btShapeHull extends BulletBase {
	private long swigCPtr;
	
	protected btShapeHull(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btShapeHull, normally you should not need this constructor it's intended for low-level usage. */ 
	public btShapeHull(long cPtr, boolean cMemoryOwn) {
		this("btShapeHull", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btShapeHull obj) {
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
				CollisionJNI.delete_btShapeHull(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btShapeHull(btConvexShape shape) {
    this(CollisionJNI.new_btShapeHull(btConvexShape.getCPtr(shape), shape), true);
  }

  public boolean buildHull(float margin) {
    return CollisionJNI.btShapeHull_buildHull(swigCPtr, this, margin);
  }

  public int numTriangles() {
    return CollisionJNI.btShapeHull_numTriangles(swigCPtr, this);
  }

  public int numVertices() {
    return CollisionJNI.btShapeHull_numVertices(swigCPtr, this);
  }

  public int numIndices() {
    return CollisionJNI.btShapeHull_numIndices(swigCPtr, this);
  }

  public btVector3 getVertexPointer() {
    long cPtr = CollisionJNI.btShapeHull_getVertexPointer(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public java.nio.LongBuffer getIndexPointer() {
    return CollisionJNI.btShapeHull_getIndexPointer(swigCPtr, this);
}

}
