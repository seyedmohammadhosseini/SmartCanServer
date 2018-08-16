/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "Platoon"
 */
package com.iot.nero.smartcan.entity.platoon;

import java.io.*;
import java.math.*;
import javax.validation.constraints.*;
import org.asnlab.asndt.runtime.conv.*;
import org.asnlab.asndt.runtime.conv.annotation.*;
import org.asnlab.asndt.runtime.type.AsnType;
import org.asnlab.asndt.runtime.value.*;

public class SmartFTeamSuccessResponseMessage {

	@NotNull
	@Component(0)
	public Long msgCount;

	@NotNull
	@Size(min=8, max=8)
	@Component(1)
	public byte[] msgid;

	@NotNull
	@Component(2)
	public Boolean msgStatus;

	@NotNull
	@Component(3)
	public byte[] errorCode;

	@NotNull
	@Component(4)
	public byte[] timestamp;

	@NotNull
	@Component(5)
	public Long syncNum;


	public Object clone() {
		return TYPE.clone(this, CONV);
	}

	public boolean equals(Object obj) {
		if(!(obj instanceof SmartFTeamSuccessResponseMessage)){
			return false;
		}
		return TYPE.equals(this, obj, CONV);
	}

	public void print(PrintStream out) {
		TYPE.print(this, CONV, out);
	}

	public void ber_encode(OutputStream out) throws IOException {
		TYPE.encode(this, EncodingRules.BASIC_ENCODING_RULES, CONV, out);
	}

	public static SmartFTeamSuccessResponseMessage ber_decode(InputStream in) throws IOException {
		return (SmartFTeamSuccessResponseMessage)TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
	}

	public void cer_encode(OutputStream out) throws IOException {
		TYPE.encode(this, EncodingRules.CANONICAL_ENCODING_RULES, CONV, out);
	}

	public static SmartFTeamSuccessResponseMessage cer_decode(InputStream in) throws IOException {
		return (SmartFTeamSuccessResponseMessage)TYPE.decode(in, EncodingRules.CANONICAL_ENCODING_RULES, CONV);
	}

	public void der_encode(OutputStream out) throws IOException {
		TYPE.encode(this, EncodingRules.DISTINGUISHED_ENCODING_RULES, CONV, out);
	}

	public static SmartFTeamSuccessResponseMessage der_decode(InputStream in) throws IOException {
		return (SmartFTeamSuccessResponseMessage)TYPE.decode(in, EncodingRules.DISTINGUISHED_ENCODING_RULES, CONV);
	}

	public void per_encode(boolean align, OutputStream out) throws IOException {
		TYPE.encode(this, align? EncodingRules.ALIGNED_PACKED_ENCODING_RULES:EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV, out);
	}

	public static SmartFTeamSuccessResponseMessage per_decode(boolean align, InputStream in) throws IOException {
		return (SmartFTeamSuccessResponseMessage)TYPE.decode(in, align? EncodingRules.ALIGNED_PACKED_ENCODING_RULES:EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
	}


	public final static AsnType TYPE = Platoon.type(65604);

	public final static CompositeConverter CONV;

	static {
		CONV = new AnnotationCompositeConverter(SmartFTeamSuccessResponseMessage.class);
		AsnConverter msgCountConverter = LongConverter.INSTANCE;
		AsnConverter msgidConverter = OctetStringConverter.INSTANCE;
		AsnConverter msgStatusConverter = BooleanConverter.INSTANCE;
		AsnConverter errorCodeConverter = ResponseErrorCode.CONV;
		AsnConverter timestampConverter = TimeStamp.CONV;
		AsnConverter syncNumConverter = LongConverter.INSTANCE;
		CONV.setComponentConverters(new AsnConverter[] { msgCountConverter, msgidConverter, msgStatusConverter, errorCodeConverter, timestampConverter, syncNumConverter });
	}


}