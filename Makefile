codegen-for-ios:
	node TestNativeProject/node_modules/react-native/scripts/generate-codegen-artifacts.js \
	--path TestNativeProject/ \
	--outputPath RTNCalculator/generated/

codegen-for-android:
	cd TestNativeProject/android && ./gradlew generateCodegenArtifactsFromSchema