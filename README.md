# quarkus-reprod-mockito-cleanup

This is a reproduction project for a Quarkus issue related to Mockito cleanup.

## Steps to reproduce the Issue
1. Run `DummyServiceMockTest`
2. Test `testWithoutMock` fails because the mock is not cleaned up properly.
3. Switch Quarkus-Version from `3.19.4` to `3.18.4`
   ```xml
   <!-- <quarkus.platform.version>3.19.4</quarkus.platform.version> -->
   <quarkus.platform.version>3.18.4</quarkus.platform.version>
   ```
4. Run `DummyServiceMockTest` again
5. All tests pass successfully