package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "packet")
@js.native
object packetNs extends js.Object {
  @js.native
  /**
    * Implementation of the Compressed Data Packet (Tag 8)
    * {@link https://tools.ietf.org/html/rfc4880#section-5.6|RFC4880 5.6}:
    * The Compressed Data packet contains compressed data.  Typically,
    * this packet is found as the contents of an encrypted packet, or following
    * a Signature or One-Pass Signature packet, and contains a literal data packet.
    */
  class Compressed () extends js.Object {
    /**
      * Compression algorithm
      * @type {compression}
      */
    var algorithm: js.Any = js.native
    /**
      * Compressed packet data
      */
    var compressed: stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array] = js.native
    /**
      * List of packets
      */
    var packets: List = js.native
    /**
      * Packet type
      */
    var tag: openpgpLib.openpgpMod.enumsNs.packet = js.native
    /**
      * Compress the packet data (member decompressedData)
      */
    def compress(): scala.Unit = js.native
    /**
      * Decompression method for decompressing the compressed data
      * read by read_packet
      */
    def decompress(): scala.Unit = js.native
    def read(bytes: openpgpLib.ReadableStream[stdLib.Uint8Array]): scala.Unit = js.native
    /**
      * Parsing function for the packet.
      * @param bytes Payload of a tag 8 packet
      */
    def read(bytes: stdLib.Uint8Array): scala.Unit = js.native
    /**
      * Return the compressed packet.
      * @returns binary compressed packet
      */
    def write(): stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array] = js.native
  }
  
  @js.native
  /**
    * This class represents a list of openpgp packets.
    * Take care when iterating over it - the packets themselves
    * are stored as numerical indices.
    */
  class List () extends js.Object {
    /**
      * The number of packets contained within the list.
      */
    val length: openpgpLib.Integer = js.native
    /**
      * Concatenates packetlist or array of packets
      */
    def concat(): scala.Unit = js.native
    /**
      * Creates a new PacketList with all packets from the given types
      */
    def filterByTag(): scala.Unit = js.native
    /**
      * Traverses packet tree and returns first matching packet
      * @param type The packet type
      * @returns
      */
    def findPacket(`type`: openpgpLib.openpgpMod.enumsNs.packet): js.UndefOr[List] = js.native
    /**
      * Returns array of found indices by tag
      */
    def indexOfTag(): scala.Unit = js.native
    /**
      * Adds a packet to the list. This is the only supported method of doing so;
      * writing to packetlist[i] directly will result in an error.
      * @param packet Packet to push
      */
    def push(packet: js.Object): scala.Unit = js.native
    def read(A: openpgpLib.ReadableStream[stdLib.Uint8Array]): scala.Unit = js.native
    /**
      * Reads a stream of binary data and interprents it as a list of packets.
      * @param A Uint8Array of bytes.
      */
    def read(A: stdLib.Uint8Array): scala.Unit = js.native
    /**
      * Creates a binary representation of openpgp objects contained within the
      * class instance.
      * @returns A Uint8Array containing valid openpgp packets.
      */
    def write(): stdLib.Uint8Array = js.native
  }
  
  @js.native
  class Literal protected () extends js.Object {
    /**
      * Implementation of the Literal Data Packet (Tag 11)
      * {@link https://tools.ietf.org/html/rfc4880#section-5.9|RFC4880 5.9}:
      * A Literal Data packet contains the body of a message; data that is not to be
      * further interpreted.
      * @param date the creation date of the literal package
      */
    def this(date: stdLib.Date) = this()
    /**
      * Get the byte sequence representing the literal packet data
      * @param clone (optional) Whether to return a clone so that getBytes/getText can be called again
      * @returns A sequence of bytes
      */
    def getBytes(clone: scala.Boolean): stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array] = js.native
    /**
      * Get the filename of the literal packet data
      * @returns filename
      */
    def getFilename(): java.lang.String = js.native
    /**
      * Returns literal data packets as native JavaScript string
      * with normalized end of line to \n
      * @param clone (optional) Whether to return a clone so that getBytes/getText can be called again
      * @returns literal data as text
      */
    def getText(clone: scala.Boolean): java.lang.String | openpgpLib.ReadableStream[java.lang.String] = js.native
    def read(input: openpgpLib.ReadableStream[stdLib.Uint8Array]): Literal = js.native
    /**
      * Parsing function for a literal data packet (tag 11).
      * @param input Payload of a tag 11 packet
      * @returns object representation
      */
    def read(input: stdLib.Uint8Array): Literal = js.native
    def setBytes(bytes: openpgpLib.ReadableStream[stdLib.Uint8Array], format: js.Any): scala.Unit = js.native
    /**
      * Set the packet data to value represented by the provided string of bytes.
      * @param bytes The string of bytes
      * @param {utf8 | binary | text | mime} format The format of the string of bytes
      */
    def setBytes(bytes: stdLib.Uint8Array, format: js.Any): scala.Unit = js.native
    /**
      * Sets the filename of the literal packet data
      * @param filename Any native javascript string
      */
    def setFilename(filename: java.lang.String): scala.Unit = js.native
    /**
      * Set the packet data to a javascript native string, end of line
      * will be normalized to \r\n and by default text is converted to UTF8
      * @param text Any native javascript string
      * @param {utf8 | binary | text | mime} format (optional) The format of the string of bytes
      */
    def setText(text: java.lang.String, format: js.Any): scala.Unit = js.native
    def setText(text: openpgpLib.ReadableStream[java.lang.String], format: js.Any): scala.Unit = js.native
    /**
      * Creates a string representation of the packet
      * @returns Uint8Array representation of the packet
      */
    def write(): stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array] = js.native
  }
  
  @js.native
  /**
    * Implementation of the strange "Marker packet" (Tag 10)
    * {@link https://tools.ietf.org/html/rfc4880#section-5.8|RFC4880 5.8}:
    * An experimental version of PGP used this packet as the Literal
    * packet, but no released version of PGP generated Literal packets with this
    * tag. With PGP 5.x, this packet has been reassigned and is reserved for use as
    * the Marker packet.
    * Such a packet MUST be ignored when received.
    */
  class Marker () extends js.Object {
    /**
      * Parsing function for a literal data packet (tag 10).
      * @param input Payload of a tag 10 packet
      * @param position Position to start reading from the input string
      * @param len Length of the packet or the remaining length of
      *        input at position
      * @returns Object representation
      */
    def read(input: java.lang.String, position: openpgpLib.Integer, len: openpgpLib.Integer): Marker = js.native
  }
  
  @js.native
  /**
    * Implementation of the One-Pass Signature Packets (Tag 4)
    * {@link https://tools.ietf.org/html/rfc4880#section-5.4|RFC4880 5.4}:
    * The One-Pass Signature packet precedes the signed data and contains
    * enough information to allow the receiver to begin calculating any
    * hashes needed to verify the signature.  It allows the Signature
    * packet to be placed at the end of the message, so that the signer
    * can compute the entire signed message in one pass.
    */
  class OnePassSignature () extends js.Object {
    /**
      * A one-octet number holding a flag showing whether the signature is nested.
      * A zero value indicates that the next packet is another One-Pass Signature packet
      * that describes another signature to be applied to the same message data.
      */
    var flags: js.Any = js.native
    /**
      * A one-octet number describing the hash algorithm used.
      * @see
      */
    var hashAlgorithm: js.Any = js.native
    /**
      * An eight-octet number holding the Key ID of the signing key.
      */
    var issuerKeyId: js.Any = js.native
    /**
      * A one-octet number describing the public-key algorithm used.
      * @see
      */
    var publicKeyAlgorithm: js.Any = js.native
    /**
      * A one-octet signature type.
      * Signature types are described in
      * {@link https://tools.ietf.org/html/rfc4880#section-5.2.1|RFC4880 Section 5.2.1}.
      */
    var signatureType: js.Any = js.native
    /**
      * Packet type
      */
    var tag: openpgpLib.openpgpMod.enumsNs.packet = js.native
    /**
      * A one-octet version number.  The current version is 3.
      */
    var version: js.Any = js.native
    /**
      * Fix custom types after cloning
      */
    def postCloneTypeFix(): scala.Unit = js.native
    /**
      * parsing function for a one-pass signature packet (tag 4).
      * @param bytes payload of a tag 4 packet
      * @returns object representation
      */
    def read(bytes: stdLib.Uint8Array): OnePassSignature = js.native
    /**
      * creates a string representation of a one-pass signature packet
      * @returns a Uint8Array representation of a one-pass signature packet
      */
    def write(): stdLib.Uint8Array = js.native
  }
  
  @js.native
  /**
    * Implementation of the Key Material Packet (Tag 5,6,7,14)
    * {@link https://tools.ietf.org/html/rfc4880#section-5.5|RFC4480 5.5}:
    * A key material packet contains all the information about a public or
    * private key.  There are four variants of this packet type, and two
    * major versions.
    * A Public-Key packet starts a series of packets that forms an OpenPGP
    * key (sometimes called an OpenPGP certificate).
    */
  class PublicKey () extends js.Object {
    /**
      * Public key algorithm.
      */
    var algorithm: java.lang.String = js.native
    /**
      * Key creation date.
      */
    var created: stdLib.Date = js.native
    /**
      * Time until expiration in days (V3 only)
      */
    var expirationTimeV3: openpgpLib.Integer = js.native
    /**
      * Fingerprint in lowercase hex
      */
    var fingerprint: java.lang.String = js.native
    /**
      * Keyid
      */
    var keyid: openpgpLib.openpgpMod.typeNs.keyidNs.Keyid = js.native
    /**
      * Algorithm specific params
      */
    var params: js.Array[js.Object] = js.native
    /**
      * Alias of read()
      * @see module:packet.PublicKey#read
      */
    var readPublicKey: js.Any = js.native
    /**
      * Packet type
      */
    var tag: openpgpLib.openpgpMod.enumsNs.packet = js.native
    /**
      * Packet version
      */
    var version: openpgpLib.Integer = js.native
    /**
      * Alias of write()
      * @see module:packet.PublicKey#write
      */
    var writePublicKey: js.Any = js.native
    /**
      * Returns algorithm information
      * @returns An object of the form {algorithm: string, bits:int, curve:String}
      */
    def getAlgorithmInfo(): js.Object = js.native
    /**
      * Returns the creation time of the key
      * @returns
      */
    def getCreationTime(): stdLib.Date = js.native
    /**
      * Calculates the fingerprint of the key
      * @returns A string containing the fingerprint in lowercase hex
      */
    def getFingerprint(): java.lang.String = js.native
    /**
      * Calculates the fingerprint of the key
      * @returns A Uint8Array containing the fingerprint
      */
    def getFingerprintBytes(): stdLib.Uint8Array = js.native
    /**
      * Calculates the key id of the key
      * @returns A 8 byte key id
      */
    def getKeyId(): java.lang.String = js.native
    /**
      * Calculates whether two keys have the same fingerprint without actually calculating the fingerprint
      * @returns Whether the two keys have the same version and public key data
      */
    def hasSameFingerprintAs(): scala.Boolean = js.native
    /**
      * Check whether secret-key data is available in decrypted form. Returns null for public keys.
      * @returns
      */
    def isDecrypted(): scala.Boolean | scala.Null = js.native
    /**
      * Fix custom types after cloning
      */
    def postCloneTypeFix(): scala.Unit = js.native
    /**
      * Internal Parser for public keys as specified in {@link https://tools.ietf.org/html/rfc4880#section-5.5.2|RFC 4880 section 5.5.2 Public-Key Packet Formats}
      * called by read_tag&lt;num&gt;
      * @param bytes Input array to read the packet from
      * @returns This object with attributes set by the parser
      */
    def read(bytes: stdLib.Uint8Array): js.Object = js.native
    /**
      * Same as write_private_key, but has less information because of
      * public key.
      * @returns OpenPGP packet body contents,
      */
    def write(): stdLib.Uint8Array = js.native
    /**
      * Write an old version packet - it's used by some of the internal routines.
      */
    def writeOld(): scala.Unit = js.native
  }
  
  @js.native
  /**
    * Public-Key Encrypted Session Key Packets (Tag 1)
    * {@link https://tools.ietf.org/html/rfc4880#section-5.1|RFC4880 5.1}:
    * A Public-Key Encrypted Session Key packet holds the session key
    * used to encrypt a message. Zero or more Public-Key Encrypted Session Key
    * packets and/or Symmetric-Key Encrypted Session Key packets may precede a
    * Symmetrically Encrypted Data Packet, which holds an encrypted message. The
    * message is encrypted with the session key, and the session key is itself
    * encrypted and stored in the Encrypted Session Key packet(s). The
    * Symmetrically Encrypted Data Packet is preceded by one Public-Key Encrypted
    * Session Key packet for each OpenPGP key to which the message is encrypted.
    * The recipient of the message finds a session key that is encrypted to their
    * public key, decrypts the session key, and then uses the session key to
    * decrypt the message.
    */
  class PublicKeyEncryptedSessionKey () extends js.Object {
    var encrypted: js.Array[_] = js.native
    /**
      * Decrypts the session key (only for public key encrypted session key
      * packets (tag 1)
      * @param key Private key with secret params unlocked
      * @returns
      */
    def decrypt(key: SecretKey): js.Promise[scala.Boolean] = js.native
    /**
      * Encrypt session key packet
      * @param key Public key
      * @returns
      */
    def encrypt(key: PublicKey): js.Promise[scala.Boolean] = js.native
    /**
      * Fix custom types after cloning
      */
    def postCloneTypeFix(): scala.Unit = js.native
    /**
      * Parsing function for a publickey encrypted session key packet (tag 1).
      * @param input Payload of a tag 1 packet
      * @param position Position to start reading from the input string
      * @param len Length of the packet or the remaining length of
      *        input at position
      * @returns Object representation
      */
    def read(input: stdLib.Uint8Array, position: openpgpLib.Integer, len: openpgpLib.Integer): PublicKeyEncryptedSessionKey = js.native
    /**
      * Create a string representation of a tag 1 packet
      * @returns The Uint8Array representation
      */
    def write(): stdLib.Uint8Array = js.native
  }
  
  @js.native
  /**
    * A Public-Subkey packet (tag 14) has exactly the same format as a
    * Public-Key packet, but denotes a subkey.  One or more subkeys may be
    * associated with a top-level key.  By convention, the top-level key
    * provides signature services, and the subkeys provide encryption
    * services.
    */
  class PublicSubkey () extends js.Object {
    /**
      * Public key algorithm.
      */
    var algorithm: java.lang.String = js.native
    /**
      * Key creation date.
      */
    var created: stdLib.Date = js.native
    /**
      * Time until expiration in days (V3 only)
      */
    var expirationTimeV3: openpgpLib.Integer = js.native
    /**
      * Fingerprint in lowercase hex
      */
    var fingerprint: java.lang.String = js.native
    /**
      * Keyid
      */
    var keyid: openpgpLib.openpgpMod.typeNs.keyidNs.Keyid = js.native
    /**
      * Algorithm specific params
      */
    var params: js.Array[js.Object] = js.native
    /**
      * Alias of read()
      * @see module:packet.PublicKey#read
      */
    var readPublicKey: js.Any = js.native
    /**
      * Packet type
      */
    var tag: openpgpLib.openpgpMod.enumsNs.packet = js.native
    /**
      * Packet version
      */
    var version: openpgpLib.Integer = js.native
    /**
      * Alias of write()
      * @see module:packet.PublicKey#write
      */
    var writePublicKey: js.Any = js.native
    /**
      * Returns algorithm information
      * @returns An object of the form {algorithm: string, bits:int, curve:String}
      */
    def getAlgorithmInfo(): js.Object = js.native
    /**
      * Returns the creation time of the key
      * @returns
      */
    def getCreationTime(): stdLib.Date = js.native
    /**
      * Calculates the fingerprint of the key
      * @returns A string containing the fingerprint in lowercase hex
      */
    def getFingerprint(): java.lang.String = js.native
    /**
      * Calculates the fingerprint of the key
      * @returns A Uint8Array containing the fingerprint
      */
    def getFingerprintBytes(): stdLib.Uint8Array = js.native
    /**
      * Calculates the key id of the key
      * @returns A 8 byte key id
      */
    def getKeyId(): java.lang.String = js.native
    /**
      * Calculates whether two keys have the same fingerprint without actually calculating the fingerprint
      * @returns Whether the two keys have the same version and public key data
      */
    def hasSameFingerprintAs(): scala.Boolean = js.native
    /**
      * Check whether secret-key data is available in decrypted form. Returns null for public keys.
      * @returns
      */
    def isDecrypted(): scala.Boolean | scala.Null = js.native
    /**
      * Fix custom types after cloning
      */
    def postCloneTypeFix(): scala.Unit = js.native
    /**
      * Internal Parser for public keys as specified in {@link https://tools.ietf.org/html/rfc4880#section-5.5.2|RFC 4880 section 5.5.2 Public-Key Packet Formats}
      * called by read_tag&lt;num&gt;
      * @param bytes Input array to read the packet from
      * @returns This object with attributes set by the parser
      */
    def read(bytes: stdLib.Uint8Array): js.Object = js.native
    /**
      * Same as write_private_key, but has less information because of
      * public key.
      * @returns OpenPGP packet body contents,
      */
    def write(): stdLib.Uint8Array = js.native
    /**
      * Write an old version packet - it's used by some of the internal routines.
      */
    def writeOld(): scala.Unit = js.native
  }
  
  @js.native
  /**
    * A Secret-Key packet contains all the information that is found in a
    * Public-Key packet, including the public-key material, but also
    * includes the secret-key material after all the public-key fields.
    */
  class SecretKey () extends js.Object {
    /**
      * Public key algorithm.
      */
    var algorithm: java.lang.String = js.native
    /**
      * Key creation date.
      */
    var created: stdLib.Date = js.native
    /**
      * Encrypted secret-key data
      */
    var encrypted: js.Any = js.native
    /**
      * Time until expiration in days (V3 only)
      */
    var expirationTimeV3: openpgpLib.Integer = js.native
    /**
      * Fingerprint in lowercase hex
      */
    var fingerprint: java.lang.String = js.native
    /**
      * Indicator if secret-key data is encrypted. `this.isEncrypted === false` means data is available in decrypted form.
      */
    var isEncrypted: js.Any = js.native
    /**
      * Keyid
      */
    var keyid: openpgpLib.openpgpMod.typeNs.keyidNs.Keyid = js.native
    /**
      * Algorithm specific params
      */
    var params: js.Array[js.Object] = js.native
    /**
      * Alias of read()
      * @see module:packet.PublicKey#read
      */
    var readPublicKey: js.Any = js.native
    /**
      * Packet type
      */
    var tag: openpgpLib.openpgpMod.enumsNs.packet = js.native
    /**
      * Packet version
      */
    var version: openpgpLib.Integer = js.native
    /**
      * Alias of write()
      * @see module:packet.PublicKey#write
      */
    var writePublicKey: js.Any = js.native
    /**
      * Clear private params, return to initial state
      */
    def clearPrivateParams(): scala.Unit = js.native
    /**
      * Decrypts the private key params which are needed to use the key.
      * {@link module:packet.SecretKey.isDecrypted} should be false, as
      * otherwise calls to this function will throw an error.
      * @param passphrase The passphrase for this private key as string
      * @returns
      */
    def decrypt(passphrase: java.lang.String): js.Promise[scala.Boolean] = js.native
    /**
      * Encrypt the payload. By default, we use aes256 and iterated, salted string
      * to key specifier. If the key is in a decrypted state (isEncrypted === false)
      * and the passphrase is empty or undefined, the key will be set as not encrypted.
      * This can be used to remove passphrase protection after calling decrypt().
      * @param passphrase
      * @returns
      */
    def encrypt(passphrase: java.lang.String): js.Promise[scala.Boolean] = js.native
    /**
      * Returns algorithm information
      * @returns An object of the form {algorithm: string, bits:int, curve:String}
      */
    def getAlgorithmInfo(): js.Object = js.native
    /**
      * Returns the creation time of the key
      * @returns
      */
    def getCreationTime(): stdLib.Date = js.native
    /**
      * Calculates the fingerprint of the key
      * @returns A string containing the fingerprint in lowercase hex
      */
    def getFingerprint(): java.lang.String = js.native
    /**
      * Calculates the fingerprint of the key
      * @returns A Uint8Array containing the fingerprint
      */
    def getFingerprintBytes(): stdLib.Uint8Array = js.native
    /**
      * Calculates the key id of the key
      * @returns A 8 byte key id
      */
    def getKeyId(): java.lang.String = js.native
    /**
      * Calculates whether two keys have the same fingerprint without actually calculating the fingerprint
      * @returns Whether the two keys have the same version and public key data
      */
    def hasSameFingerprintAs(): scala.Boolean = js.native
    /**
      * Check whether secret-key data is available in decrypted form. Returns null for public keys.
      * @returns
      */
    def isDecrypted(): scala.Boolean | scala.Null = js.native
    /**
      * Fix custom types after cloning
      */
    def postCloneTypeFix(): scala.Unit = js.native
    /**
      * Internal parser for private keys as specified in
      * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-5.5.3|RFC4880bis-04 section 5.5.3}
      * @param bytes Input string to read the packet from
      */
    def read(bytes: java.lang.String): scala.Unit = js.native
    /**
      * Creates an OpenPGP key packet for the given key.
      * @returns A string of bytes containing the secret key OpenPGP packet
      */
    def write(): java.lang.String = js.native
    /**
      * Write an old version packet - it's used by some of the internal routines.
      */
    def writeOld(): scala.Unit = js.native
  }
  
  @js.native
  /**
    * A Secret-Subkey packet (tag 7) is the subkey analog of the Secret
    * Key packet and has exactly the same format.
    */
  class SecretSubkey () extends js.Object {
    /**
      * Public key algorithm.
      */
    var algorithm: java.lang.String = js.native
    /**
      * Key creation date.
      */
    var created: stdLib.Date = js.native
    /**
      * Encrypted secret-key data
      */
    var encrypted: js.Any = js.native
    /**
      * Time until expiration in days (V3 only)
      */
    var expirationTimeV3: openpgpLib.Integer = js.native
    /**
      * Fingerprint in lowercase hex
      */
    var fingerprint: java.lang.String = js.native
    /**
      * Indicator if secret-key data is encrypted. `this.isEncrypted === false` means data is available in decrypted form.
      */
    var isEncrypted: js.Any = js.native
    /**
      * Keyid
      */
    var keyid: openpgpLib.openpgpMod.typeNs.keyidNs.Keyid = js.native
    /**
      * Algorithm specific params
      */
    var params: js.Array[js.Object] = js.native
    /**
      * Alias of read()
      * @see module:packet.PublicKey#read
      */
    var readPublicKey: js.Any = js.native
    /**
      * Packet type
      */
    var tag: openpgpLib.openpgpMod.enumsNs.packet = js.native
    /**
      * Packet version
      */
    var version: openpgpLib.Integer = js.native
    /**
      * Alias of write()
      * @see module:packet.PublicKey#write
      */
    var writePublicKey: js.Any = js.native
    /**
      * Clear private params, return to initial state
      */
    def clearPrivateParams(): scala.Unit = js.native
    /**
      * Decrypts the private key params which are needed to use the key.
      * {@link module:packet.SecretKey.isDecrypted} should be false, as
      * otherwise calls to this function will throw an error.
      * @param passphrase The passphrase for this private key as string
      * @returns
      */
    def decrypt(passphrase: java.lang.String): js.Promise[scala.Boolean] = js.native
    /**
      * Encrypt the payload. By default, we use aes256 and iterated, salted string
      * to key specifier. If the key is in a decrypted state (isEncrypted === false)
      * and the passphrase is empty or undefined, the key will be set as not encrypted.
      * This can be used to remove passphrase protection after calling decrypt().
      * @param passphrase
      * @returns
      */
    def encrypt(passphrase: java.lang.String): js.Promise[scala.Boolean] = js.native
    /**
      * Returns algorithm information
      * @returns An object of the form {algorithm: string, bits:int, curve:String}
      */
    def getAlgorithmInfo(): js.Object = js.native
    /**
      * Returns the creation time of the key
      * @returns
      */
    def getCreationTime(): stdLib.Date = js.native
    /**
      * Calculates the fingerprint of the key
      * @returns A string containing the fingerprint in lowercase hex
      */
    def getFingerprint(): java.lang.String = js.native
    /**
      * Calculates the fingerprint of the key
      * @returns A Uint8Array containing the fingerprint
      */
    def getFingerprintBytes(): stdLib.Uint8Array = js.native
    /**
      * Calculates the key id of the key
      * @returns A 8 byte key id
      */
    def getKeyId(): java.lang.String = js.native
    /**
      * Calculates whether two keys have the same fingerprint without actually calculating the fingerprint
      * @returns Whether the two keys have the same version and public key data
      */
    def hasSameFingerprintAs(): scala.Boolean = js.native
    /**
      * Check whether secret-key data is available in decrypted form. Returns null for public keys.
      * @returns
      */
    def isDecrypted(): scala.Boolean | scala.Null = js.native
    /**
      * Fix custom types after cloning
      */
    def postCloneTypeFix(): scala.Unit = js.native
    /**
      * Internal parser for private keys as specified in
      * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-5.5.3|RFC4880bis-04 section 5.5.3}
      * @param bytes Input string to read the packet from
      */
    def read(bytes: java.lang.String): scala.Unit = js.native
    /**
      * Creates an OpenPGP key packet for the given key.
      * @returns A string of bytes containing the secret key OpenPGP packet
      */
    def write(): java.lang.String = js.native
    /**
      * Write an old version packet - it's used by some of the internal routines.
      */
    def writeOld(): scala.Unit = js.native
  }
  
  @js.native
  class Signature protected () extends js.Object {
    /**
      * Implementation of the Signature Packet (Tag 2)
      * {@link https://tools.ietf.org/html/rfc4880#section-5.2|RFC4480 5.2}:
      * A Signature packet describes a binding between some public key and
      * some data.  The most common signatures are a signature of a file or a
      * block of text, and a signature that is a certification of a User ID.
      * @param date the creation date of the signature
      */
    def this(date: stdLib.Date) = this()
    /**
      * Returns the expiration time of the signature or Infinity if signature does not expire
      * @returns expiration time
      */
    def getExpirationTime(): stdLib.Date = js.native
    /**
      * Verifies signature expiration date
      * @param date (optional) use the given date for verification instead of the current time
      * @returns true if expired
      */
    def isExpired(date: stdLib.Date): scala.Boolean = js.native
    /**
      * Fix custom types after cloning
      */
    def postCloneTypeFix(): scala.Unit = js.native
    /**
      * parsing function for a signature packet (tag 2).
      * @param bytes payload of a tag 2 packet
      * @param position position to start reading from the bytes string
      * @param len length of the packet or the remaining length of bytes at position
      * @returns object representation
      */
    def read(bytes: java.lang.String, position: openpgpLib.Integer, len: openpgpLib.Integer): Signature = js.native
    /**
      * Signs provided data. This needs to be done prior to serialization.
      * @param key private key used to sign the message.
      * @param data Contains packets to be signed.
      * @returns
      */
    def sign(key: SecretKey, data: js.Object): js.Promise[scala.Boolean] = js.native
    def verify(key: PublicKey, signatureType: openpgpLib.openpgpMod.enumsNs.signature, data: java.lang.String): js.Promise[scala.Boolean] = js.native
    def verify(key: PublicKey, signatureType: openpgpLib.openpgpMod.enumsNs.signature, data: js.Object): js.Promise[scala.Boolean] = js.native
    /**
      * verifys the signature packet. Note: not signature types are implemented
      * @param key the public key to verify the signature
      * @param signatureType expected signature type
      * @param data data which on the signature applies
      * @returns True if message is verified, else false.
      */
    def verify(key: PublicSubkey, signatureType: openpgpLib.openpgpMod.enumsNs.signature, data: java.lang.String): js.Promise[scala.Boolean] = js.native
    def verify(key: PublicSubkey, signatureType: openpgpLib.openpgpMod.enumsNs.signature, data: js.Object): js.Promise[scala.Boolean] = js.native
    def verify(key: SecretKey, signatureType: openpgpLib.openpgpMod.enumsNs.signature, data: java.lang.String): js.Promise[scala.Boolean] = js.native
    def verify(key: SecretKey, signatureType: openpgpLib.openpgpMod.enumsNs.signature, data: js.Object): js.Promise[scala.Boolean] = js.native
    def verify(key: SecretSubkey, signatureType: openpgpLib.openpgpMod.enumsNs.signature, data: java.lang.String): js.Promise[scala.Boolean] = js.native
    def verify(key: SecretSubkey, signatureType: openpgpLib.openpgpMod.enumsNs.signature, data: js.Object): js.Promise[scala.Boolean] = js.native
    /**
      * Creates Uint8Array of bytes of all subpacket data except Issuer and Embedded Signature subpackets
      * @returns subpacket data
      */
    def write_hashed_sub_packets(): stdLib.Uint8Array = js.native
    /**
      * Creates Uint8Array of bytes of Issuer and Embedded Signature subpackets
      * @returns subpacket data
      */
    def write_unhashed_sub_packets(): stdLib.Uint8Array = js.native
  }
  
  @js.native
  /**
    * Implementation of the Symmetrically Encrypted Authenticated Encryption with
    * Additional Data (AEAD) Protected Data Packet
    * {@link https://tools.ietf.org/html/draft-ford-openpgp-format-00#section-2.1}:
    * AEAD Protected Data Packet
    */
  class SymEncryptedAEADProtected () extends js.Object {
    def crypt(
      fn: js.Any,
      key: stdLib.Uint8Array,
      data: openpgpLib.ReadableStream[stdLib.Uint8Array],
      streaming: scala.Boolean
    ): stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array] = js.native
    /**
      * En/decrypt the payload.
      * @param {encrypt | decrypt} fn Whether to encrypt or decrypt
      * @param key The session key used to en/decrypt the payload
      * @param data The data to en/decrypt
      * @param streaming Whether the top-level function will return a stream
      * @returns
      */
    def crypt(fn: js.Any, key: stdLib.Uint8Array, data: stdLib.Uint8Array, streaming: scala.Boolean): stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array] = js.native
    /**
      * Decrypt the encrypted payload.
      * @param sessionKeyAlgorithm The session key's cipher algorithm e.g. 'aes128'
      * @param key The session key used to encrypt the payload
      * @param streaming Whether the top-level function will return a stream
      * @returns
      */
    def decrypt(sessionKeyAlgorithm: java.lang.String, key: stdLib.Uint8Array, streaming: scala.Boolean): scala.Boolean = js.native
    /**
      * Encrypt the packet list payload.
      * @param sessionKeyAlgorithm The session key's cipher algorithm e.g. 'aes128'
      * @param key The session key used to encrypt the payload
      * @param streaming Whether the top-level function will return a stream
      */
    def encrypt(sessionKeyAlgorithm: java.lang.String, key: stdLib.Uint8Array, streaming: scala.Boolean): scala.Unit = js.native
    def read(bytes: openpgpLib.ReadableStream[stdLib.Uint8Array]): scala.Unit = js.native
    /**
      * Parse an encrypted payload of bytes in the order: version, IV, ciphertext (see specification)
      * @param bytes
      */
    def read(bytes: stdLib.Uint8Array): scala.Unit = js.native
    /**
      * Write the encrypted payload of bytes in the order: version, IV, ciphertext (see specification)
      * @returns The encrypted payload
      */
    def write(): stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array] = js.native
  }
  
  @js.native
  /**
    * Implementation of the Sym. Encrypted Integrity Protected Data Packet (Tag 18)
    * {@link https://tools.ietf.org/html/rfc4880#section-5.13|RFC4880 5.13}:
    * The Symmetrically Encrypted Integrity Protected Data packet is
    * a variant of the Symmetrically Encrypted Data packet. It is a new feature
    * created for OpenPGP that addresses the problem of detecting a modification to
    * encrypted data. It is used in combination with a Modification Detection Code
    * packet.
    */
  class SymEncryptedIntegrityProtected () extends js.Object {
    /**
      * The encrypted payload.
      */
    var encrypted: js.Any = js.native
    /**
      * If after decrypting the packet this is set to true,
      * a modification has been detected and thus the contents
      * should be discarded.
      */
    var modification: scala.Boolean = js.native
    /**
      * Decrypts the encrypted data contained in the packet.
      * @param sessionKeyAlgorithm The selected symmetric encryption algorithm to be used e.g. 'aes128'
      * @param key The key of cipher blocksize length to be used
      * @param streaming Whether to read this.encrypted as a stream
      * @returns
      */
    def decrypt(sessionKeyAlgorithm: java.lang.String, key: stdLib.Uint8Array, streaming: scala.Boolean): js.Promise[scala.Boolean] = js.native
    /**
      * Encrypt the payload in the packet.
      * @param sessionKeyAlgorithm The selected symmetric encryption algorithm to be used e.g. 'aes128'
      * @param key The key of cipher blocksize length to be used
      * @param streaming Whether to set this.encrypted to a stream
      * @returns
      */
    def encrypt(sessionKeyAlgorithm: java.lang.String, key: stdLib.Uint8Array, streaming: scala.Boolean): js.Promise[scala.Boolean] = js.native
  }
  
  @js.native
  /**
    * Public-Key Encrypted Session Key Packets (Tag 1)
    * {@link https://tools.ietf.org/html/rfc4880#section-5.1|RFC4880 5.1}:
    * A Public-Key Encrypted Session Key packet holds the session key
    * used to encrypt a message. Zero or more Public-Key Encrypted Session Key
    * packets and/or Symmetric-Key Encrypted Session Key packets may precede a
    * Symmetrically Encrypted Data Packet, which holds an encrypted message. The
    * message is encrypted with the session key, and the session key is itself
    * encrypted and stored in the Encrypted Session Key packet(s). The
    * Symmetrically Encrypted Data Packet is preceded by one Public-Key Encrypted
    * Session Key packet for each OpenPGP key to which the message is encrypted.
    * The recipient of the message finds a session key that is encrypted to their
    * public key, decrypts the session key, and then uses the session key to
    * decrypt the message.
    */
  class SymEncryptedSessionKey () extends js.Object {
    /**
      * Decrypts the session key
      * @param passphrase The passphrase in string form
      * @returns
      */
    def decrypt(passphrase: java.lang.String): js.Promise[scala.Boolean] = js.native
    /**
      * Encrypts the session key
      * @param passphrase The passphrase in string form
      * @returns
      */
    def encrypt(passphrase: java.lang.String): js.Promise[scala.Boolean] = js.native
    /**
      * Fix custom types after cloning
      */
    def postCloneTypeFix(): scala.Unit = js.native
    /**
      * Parsing function for a symmetric encrypted session key packet (tag 3).
      * @param input Payload of a tag 1 packet
      * @param position Position to start reading from the input string
      * @param len Length of the packet or the remaining length of
      *        input at position
      * @returns Object representation
      */
    def read(input: stdLib.Uint8Array, position: openpgpLib.Integer, len: openpgpLib.Integer): SymEncryptedSessionKey = js.native
  }
  
  @js.native
  /**
    * Implementation of the Symmetrically Encrypted Data Packet (Tag 9)
    * {@link https://tools.ietf.org/html/rfc4880#section-5.7|RFC4880 5.7}:
    * The Symmetrically Encrypted Data packet contains data encrypted with a
    * symmetric-key algorithm. When it has been decrypted, it contains other
    * packets (usually a literal data packet or compressed data packet, but in
    * theory other Symmetrically Encrypted Data packets or sequences of packets
    * that form whole OpenPGP messages).
    */
  class SymmetricallyEncrypted () extends js.Object {
    /**
      * Encrypted secret-key data
      */
    var encrypted: js.Any = js.native
    /**
      * When true, decrypt fails if message is not integrity protected
      * @see module:config.ignore_mdc_error
      */
    var ignore_mdc_error: js.Any = js.native
    /**
      * Decrypted packets contained within.
      */
    var packets: List = js.native
    /**
      * Packet type
      */
    var tag: openpgpLib.openpgpMod.enumsNs.packet = js.native
    /**
      * Decrypt the symmetrically-encrypted packet data
      * See {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC 4880 9.2} for algorithms.
      * @param sessionKeyAlgorithm Symmetric key algorithm to use
      * @param key The key of cipher blocksize length to be used
      * @returns
      */
    def decrypt(sessionKeyAlgorithm: openpgpLib.openpgpMod.enumsNs.symmetric, key: stdLib.Uint8Array): js.Promise[scala.Boolean] = js.native
    /**
      * Encrypt the symmetrically-encrypted packet data
      * See {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC 4880 9.2} for algorithms.
      * @param sessionKeyAlgorithm Symmetric key algorithm to use
      * @param key The key of cipher blocksize length to be used
      * @returns
      */
    def encrypt(sessionKeyAlgorithm: openpgpLib.openpgpMod.enumsNs.symmetric, key: stdLib.Uint8Array): js.Promise[scala.Boolean] = js.native
  }
  
  @js.native
  /**
    * Implementation of the Trust Packet (Tag 12)
    * {@link https://tools.ietf.org/html/rfc4880#section-5.10|RFC4880 5.10}:
    * The Trust packet is used only within keyrings and is not normally
    * exported.  Trust packets contain data that record the user's
    * specifications of which key holders are trustworthy introducers,
    * along with other information that implementing software uses for
    * trust information.  The format of Trust packets is defined by a given
    * implementation.
    * Trust packets SHOULD NOT be emitted to output streams that are
    * transferred to other users, and they SHOULD be ignored on any input
    * other than local keyring files.
    */
  class Trust () extends js.Object {
    /**
      * Parsing function for a trust packet (tag 12).
      * Currently not implemented as we ignore trust packets
      * @param byptes payload of a tag 12 packet
      */
    def read(byptes: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  /**
    * Implementation of the User Attribute Packet (Tag 17)
    * The User Attribute packet is a variation of the User ID packet.  It
    * is capable of storing more types of data than the User ID packet,
    * which is limited to text.  Like the User ID packet, a User Attribute
    * packet may be certified by the key owner ("self-signed") or any other
    * key owner who cares to certify it.  Except as noted, a User Attribute
    * packet may be used anywhere that a User ID packet may be used.
    * While User Attribute packets are not a required part of the OpenPGP
    * standard, implementations SHOULD provide at least enough
    * compatibility to properly handle a certification signature on the
    * User Attribute packet.  A simple way to do this is by treating the
    * User Attribute packet as a User ID packet with opaque contents, but
    * an implementation may use any method desired.
    */
  class UserAttribute () extends js.Object {
    /**
      * Compare for equality
      * @param usrAttr
      * @returns true if equal
      */
    def equals(usrAttr: UserAttribute): scala.Boolean = js.native
    /**
      * parsing function for a user attribute packet (tag 17).
      * @param input payload of a tag 17 packet
      */
    def read(input: stdLib.Uint8Array): scala.Unit = js.native
    /**
      * Creates a binary representation of the user attribute packet
      * @returns string representation
      */
    def write(): stdLib.Uint8Array = js.native
  }
  
  @js.native
  /**
    * Implementation of the User ID Packet (Tag 13)
    * A User ID packet consists of UTF-8 text that is intended to represent
    * the name and email address of the key holder.  By convention, it
    * includes an RFC 2822 [RFC2822] mail name-addr, but there are no
    * restrictions on its content.  The packet length in the header
    * specifies the length of the User ID.
    */
  class Userid () extends js.Object {
    /**
      * A string containing the user id. Usually in the form
      * John Doe <john@example.com>
      */
    var userid: java.lang.String = js.native
    /**
      * Set userid string from object, e.g. { name:'Phil Zimmermann', email:'phil@openpgp.org' }
      */
    def format(): scala.Unit = js.native
    /**
      * Parse userid string, e.g. 'John Doe <john@example.com>'
      */
    def parse(): scala.Unit = js.native
    /**
      * Parsing function for a user id packet (tag 13).
      * @param input payload of a tag 13 packet
      */
    def read(input: stdLib.Uint8Array): scala.Unit = js.native
    /**
      * Creates a binary representation of the user id packet
      * @returns binary representation
      */
    def write(): stdLib.Uint8Array = js.native
  }
  
  /**
    * Allocate a new packet from structured packet clone
    * @see
    * @param packetClone packet clone
    * @returns new packet object with data from packet clone
    */
  def fromStructuredClone(packetClone: js.Object): js.Object = js.native
  /**
    * Allocate a new packet
    * @param tag property name from {@link module:enums.packet}
    * @returns new packet object with type based on tag
    */
  def newPacketFromTag(tag: java.lang.String): js.Object = js.native
  /* static members */
  @js.native
  object List extends js.Object {
    /**
      * Allocate a new packetlist from structured packetlist clone
      * See {@link https://w3c.github.io/html/infrastructure.html#safe-passing-of-structured-data}
      * @param packetClone packetlist clone
      * @returns new packetlist object with data from packetlist clone
      */
    def fromStructuredClone(packetClone: js.Object): js.Object = js.native
  }
  
  @JSName("all_packets")
  @js.native
  object allUnderscorePacketsNs extends js.Object {
    /**
      * @see module:packet.Compressed
      */
    var Compressed: js.Any = js.native
    /**
      * @see module:packet.Literal
      */
    var Literal: js.Any = js.native
    /**
      * @see module:packet.Marker
      */
    var Marker: js.Any = js.native
    /**
      * @see module:packet.OnePassSignature
      */
    var OnePassSignature: js.Any = js.native
    /**
      * @see module:packet.PublicKey
      */
    var PublicKey: js.Any = js.native
    /**
      * @see module:packet.PublicKeyEncryptedSessionKey
      */
    var PublicKeyEncryptedSessionKey: js.Any = js.native
    /**
      * @see module:packet.PublicSubkey
      */
    var PublicSubkey: js.Any = js.native
    /**
      * @see module:packet.SecretKey
      */
    var SecretKey: js.Any = js.native
    /**
      * @see module:packet.SecretSubkey
      */
    var SecretSubkey: js.Any = js.native
    /**
      * @see module:packet.Signature
      */
    var Signature: js.Any = js.native
    /**
      * @see module:packet.SymEncryptedAEADProtected
      */
    var SymEncryptedAEADProtected: js.Any = js.native
    /**
      * @see module:packet.SymEncryptedIntegrityProtected
      */
    var SymEncryptedIntegrityProtected: js.Any = js.native
    /**
      * @see module:packet.SymEncryptedSessionKey
      */
    var SymEncryptedSessionKey: js.Any = js.native
    /**
      * @see module:packet.SymmetricallyEncrypted
      */
    var SymmetricallyEncrypted: js.Any = js.native
    /**
      * @see module:packet.Trust
      */
    var Trust: js.Any = js.native
    /**
      * @see module:packet.UserAttribute
      */
    var UserAttribute: js.Any = js.native
    /**
      * @see module:packet.Userid
      */
    var Userid: js.Any = js.native
  }
  
  @JSName("clone")
  @js.native
  object cloneNs extends js.Object {
    /**
      * Create a packetlist from the correspoding object types.
      * @param options the object passed to and from the web worker
      * @returns a mutated version of the options optject
      */
    def clonePackets(options: js.Object): js.Object = js.native
    /**
      * Creates an object with the correct prototype from a corresponding packetlist.
      * @param options the object passed to and from the web worker
      * @param method the public api function name to be delegated to the worker
      * @returns a mutated version of the options optject
      */
    def parseClonedPackets(options: js.Object, method: java.lang.String): js.Object = js.native
  }
  
  @JSName("packet")
  @js.native
  object packetNs extends js.Object {
    def read(input: openpgpLib.ReadableStream[stdLib.Uint8Array], callback: js.Function): scala.Boolean = js.native
    /**
      * Generic static Packet Parser function
      * @param input Input stream as string
      * @param callback Function to call with the parsed packet
      * @returns Returns false if the stream was empty and parsing is done, and true otherwise.
      */
    def read(input: stdLib.Uint8Array, callback: js.Function): scala.Boolean = js.native
    /**
      * Whether the packet type supports partial lengths per RFC4880
      * @param tag_type Tag type
      * @returns String of the header
      */
    def supportsStreaming(tag_type: openpgpLib.Integer): scala.Boolean = js.native
    /**
      * Writes a packet header version 4 with the given tag_type and length to a
      * string
      * @param tag_type Tag type
      * @param length Length of the payload
      * @returns String of the header
      */
    def writeHeader(tag_type: openpgpLib.Integer, length: openpgpLib.Integer): java.lang.String = js.native
    /**
      * Writes a packet header Version 3 with the given tag_type and length to a
      * string
      * @param tag_type Tag type
      * @param length Length of the payload
      * @returns String of the header
      */
    def writeOldHeader(tag_type: openpgpLib.Integer, length: openpgpLib.Integer): java.lang.String = js.native
    /**
      * Encodes a given integer of length to the openpgp length specifier to a
      * string
      * @param length The length to encode
      * @returns String with openpgp length representation
      */
    def writeSimpleLength(length: openpgpLib.Integer): stdLib.Uint8Array = js.native
  }
  
}

